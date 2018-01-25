grammar Practica;
prog  : expression_list;
expression_list : expression_list expression terminator
                  | expression terminator 
                  | terminator
                  ;
expression : rvalue			#rvalor	
			|bucle_if		#b_if	
			|bucle_while	#b_while	
			|BOOLEAN		#booleano	
			|print 			#imprime	
			;
rvalue : assignment 			#assign
         | rvalue OPCOMP rvalue #comp
         | rvalue MUL rvalue	#mul
         | rvalue DIV rvalue 	#div
         | rvalue PLUS rvalue 	#plus
         | rvalue MINUS rvalue	#minus
         | lvalue 				#id
         | INT 					#int
         //| FLOAT #float
         ;

bucle_if : IF expression THEN crlf expression_list cons_if 
		 | IF expression crlf expression_list cons_if 
		 | UNLESS expression THEN crlf expression_list cons_unless
         | UNLESS expression crlf expression_list cons_unless
         ; 
cons_unless : ELSE crlf expression_list crlf END
            | crlf END
            ;
cons_if  : ELSIF expression THEN crlf expression_list cons_if
		 | ELSIF expression crlf expression_list cons_if
         | ELSE crlf expression_list END
         | END
         ;
bucle_while : WHILE expression crlf DO crlf expression_list END
	    | WHILE expression terminator 
	    | UNTIL expression crlf DO expression_list END
	    ;
assignment : lvalue ASSIGN rvalue;
print : PRINT lvalue #impID
	  | PRINT rvalue #impNum
	  | PRINT string #impString
	  ;
lvalue : ID ;
string : STRING ;
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

PRINT : 'puts';
BOOLEAN : 'true' | 'false' ;

STRING : '"' (~'"' | '"')* '"' ;
INT : [0-9]+;
FLOAT : [0-9]*'.'[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

SEMICOLON : ';';
CRLF : '\r'? '\n';

WS : (' '|'\t')+ -> skip ; 
COMMENT: ('#' ~('\r' | '\n')* '\r'? '\n') -> skip;
 


