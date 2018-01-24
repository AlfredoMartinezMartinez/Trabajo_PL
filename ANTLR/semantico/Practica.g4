grammar Practica;

@header {
package tools;
import java.util.*;
}
@parser::members {
  Map<String, Integer> memory = new HashMap<String, Integer>();
    int eval(int left, char op, int right) {
      switch ( op ) {
        case MUL : return left * right;
        case DIV : return left / right;
        case PLUS : return left + right;
        case MINUS : return left - right;	
      }
    return 0;
    }
}

prog  : expression_list;
expression_list : expression_list expression terminator
                  | expression terminator
                  | terminator
                  ;

expression returns [ASTNode node]: rvalue
      | lvalue
      | bvalue
      | bucle_if
	  ;

rvalue: assignment {$v=$assignment.v;}
         | plus
		 | minus 
		 | mul
		 | div
		 ;

plus returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (PLUS n2 = number new Addition{$node, $n2.node})*;

subsctraction returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MINUS n2 = number new Substract{$node, $n2.node})*;

mul returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MUL n2 = number new Multiplication{$node, $n2.node})*;

div returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (DIV n2 = number new Division{$node, $n2.node})*;		 
         
bvalue : rvalue OPCOMP rvalue ;

bucle_if returns [ASTNode node]: IF expression
			{
				List <ASTNode> ifbody = new ArrayList <ASTNode>();
			} 
			THEN crlf (e1=expression_list {ifbody.add($s1.node);})* ELSE 
			{
				List <ASTNode> elsebody = new ArrayList <ASTNode>();
			}
			crlf (e2=expression_list {elsebody.add($s2.node);}) crlf END
			{
				$node = new If($expression.node, ifbody, elsebody);
		 	}
		 | IF expression 
			{
				List <ASTNode> ifbody = new ArrayList <ASTNode>();
			} 
			crlf (e1=expression_list {ifbody.add($s1.node);})* ELSE
			{
				List <ASTNode> elsebody = new ArrayList <ASTNode>();
			}
			crlf (e2=expression_list {elsebody.add($s2.node);})* crlf END
			{
				$node = new If($expression.node, ifbody, elsebody);
		 	}
		 ;

assignment : lvalue ASSIGN rvalue;
lvalue : ID ;
number returns [ASTNode node]:
		INT {$node = new Constante(Integer.pasrInd($INT.text));}
		;
terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;
crlf : CRLF;

ASSIGN : '=';
OPCOMP : '==' | '!=' | '=~' | '<=>' | '>' | '>=' | '<' | '<=' | '===' | '!~' ;


WHILE : 'while' ;
UNTIL : 'until' ;
UNLESS : 'unless' ;
IF : 'if' ;
DO : 'do';
THEN : 'then';
ELSIF : 'elsif' ;
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
