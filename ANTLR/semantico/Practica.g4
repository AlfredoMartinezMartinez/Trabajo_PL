grammar Practica;

@header {
package tools;
import java.util.*;
}
@parser::members {
}

prog  : {List<ASTNode> body = new ArrayList<ASTNode>();
          Map <String, Object> symbolTable<String, Object>();} expression terminator {$body.add($expresion.node)}
          { for ASTNode n: body) {
            n.execute(symbolTable);
          }};

expression returns [ASTNode node]:
      | rvalue {$node = $rvalue.node;}
      | bucle_if {$node = $bucle_if.node;}
	  ;

rvalue returns [ASTNode node]: declaration {$node=$declaration.node;}
     | assignment {$node=$assignment.node;}
     | reference {$node=$reference.node;}
     | plus {$node = $plus.node;}
		 | minus {$node = $minus.node;}
		 | mul {$node = $mul.node;}
		 | div {$node = $div.node;}
		 ;

plus returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (PLUS n2 = number new Addition{$node, $n2.node})*;

subsctraction returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MINUS n2 = number new Substract{$node, $n2.node})*;

mul returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MUL n2 = number new Multiplication{$node, $n2.node})*;

div returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (DIV n2 = number new Division{$node, $n2.node})*;

bucle_if returns [ASTNode node]: IF expression
			{
				List <ASTNode> ifbody = new ArrayList <ASTNode>();
			}
			THEN crlf (e1=expression {ifbody.add($e1.node);})* ELSE
			{
				List <ASTNode> elsebody = new ArrayList <ASTNode>();
			}
			crlf (e2=expression {elsebody.add($e2.node);}) crlf END
			{
				$node = new If($expression.node, ifbody, elsebody);
		 	}
		 | IF expression
			{
				List <ASTNode> ifbody = new ArrayList <ASTNode>();
			}
			crlf (e1=expression {ifbody.add($e1.node);})* ELSE
			{
				List <ASTNode> elsebody = new ArrayList <ASTNode>();
			}
			crlf (e2=expression {elsebody.add($e2.node);})* crlf END
			{
				$node = new If($expression.node, ifbody, elsebody);
		 	}
		 ;

assignment returns [ASTNode node] : ID ASSIGN rvalue {$node = new Assignment($ID.text,$rvalue.node);};
reference returns [ASTNode node] : ID {$node = new Reference($ID.text);}
number returns [ASTNode node]:
		INT {$node = new Constante(Integer.parseInt($INT.text));}
		;
terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;
crlf : CRLF;

ASSIGN : '=';
OPCOMP : '==' | '!=' | '=~' | '<=>' | '>' | '>=' | '<' | '<=' | '===' | '!~' ;


IF : 'if' ;
THEN : 'then';
ELSE : 'else';
END : 'end' ;
PLUS : '+';
MINUS : '-';
MUL : '*';
DIV : '/';

INT : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

SEMICOLON : ';';
CRLF : '\r'? '\n';

WS : (' '|'\t')+ -> skip ;
COMMENT: ('#' ~('\r' | '\n')* '\r'? '\n') -> skip;
