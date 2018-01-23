grammar Practica;
prog  : expression_list;
expression_list : expression_list expression terminator
                  | expression terminator 
                  | terminator
                  ;
expression : rvalue
			|bucle_if
			|bucle_while
			;
rvalue : assignment 
         | rvalue OPCOMP rvalue
         | rvalue MUL rvalue 
         | rvalue DIV rvalue 
         | rvalue PLUS rvalue 
         | rvalue MINUS rvalue
         | lvalue
         | INT
         | FLOAT ;

bucle_if : IF expression THEN crlf expression_list cons_if 
         | UNLESS expression THEN crlf expression_list cons_unless
         ; 
cons_unless : ELSE crlf expression_list crlf END
            | crlf END
            ;
cons_if  : ELSIF expression THEN crlf expression_list cons_if
         | ELSE crlf expression_list END
         | END
         ;
bucle_while : WHILE expression crlf DO crlf expression_list END
	    | WHILE expression terminator 
	    | UNTIL expression crlf DO expression_list END
	    ;
assignment : lvalue ASSIGN rvalue;
lvalue : ID ;
terminator : SEMICOLON 
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
FLOAT : [0-9]*'.'[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

SEMICOLON : ';';
CRLF : '\r'? '\n';

WS : (' '|'\t')+ -> skip ; 

 


