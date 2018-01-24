grammar Practica;

@header {
	package tools;
	import java.util.*;
}
@parser::members {
}

prog  : {List<ASTNode> body = new ArrayList<ASTNode>(); Map <String, Object> symbolTable<String, Object>();} 
	(sentence {body.add($sentence.node);})* CRLF 
	{for (ASTNode n: body) {
	    n.execute(symbolTable);
	 }};

sentence returns [ASTNode node]:  print {$node = $print.node;}
				| assignment {$node=$assignment.node;}
     				| reference {$node=$reference.node;}
				| rvalue {$node = $rvalue.node;}
      				| bucle_if {$node = $bucle_if.node;};

expression returns [ASTNode node]: BOOLEAN {$node = new Constante(Boolean.parseBoolean($BOOLEAN.text));};
      

print returns [ASTNode node]: PRINT expression {$node= new Print($expression.node);};
	
rvalue returns [ASTNode node]: plus {$node = $plus.node;}
     			     | minus {$node = $minus.node;}
                             | mul {$node = $mul.node;}
                             | div {$node = $div.node;}
			     | number {$node = $number.node;};

plus returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (PLUS n2=number {$node = new Addition($node, $n2.node);})*;

minus returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MINUS n2=number {$node = new Substract($node, $n2.node);})*;

mul returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (MUL n2=number {$node = new Multiplication($node, $n2.node);})*;

div returns [ASTNode node]:
		 n1 = number {$node = $n1.node;} (DIV n2=number {$node = new Division($node, $n2.node);})*;

bucle_if returns [ASTNode node]: IF expression {List <ASTNode> ifbody = new ArrayList <ASTNode>();}
					THEN CRLF (e1=sentence {ifbody.add($e1.node);})* 
				 ELSE {List <ASTNode> elsebody = new ArrayList <ASTNode>();}
					CRLF (e2=sentence {elsebody.add($e2.node);})* CRLF END
				{$node = new If($expression.node, ifbody, elsebody);};

assignment returns [ASTNode node] : ID ASSIGN rvalue {$node = new Assignment($ID.text,$rvalue.node);};

reference returns [ASTNode node] : ID {$node = new Reference($ID.text);} ;

number returns [ASTNode node]: INT {$node = new Constante(Integer.parseInt($INT.text));};

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
PRINT : 'puts';

INT : [0-9]+;
BOOLEAN : 'true' | 'false' ;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

SEMICOLON : ';';
CRLF : '\r'? '\n';

WS : (' '|'\t')+ -> skip ;
COMMENT: ('#' ~('\r' | '\n')* '\r'? '\n') -> skip;
