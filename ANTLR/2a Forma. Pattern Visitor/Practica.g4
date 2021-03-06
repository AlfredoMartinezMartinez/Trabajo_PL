grammar Practica;
prog  : expression_list;
expression_list : expression_list expression terminator
                  | expression terminator 
                  | terminator
                  | print
                  ;
expression : rvalue			#rvalor	
			|bucle_if		#b_if	
			|bucle_while	#b_while	
			|bool		    #booleano	
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
         ;

bucle_if : IF expression THEN crlf expression_list cons_if #ifthen
		 | IF expression crlf expression_list cons_if 		#ifclrf
		 | UNLESS expression THEN crlf expression_list cons_unless #unlessthen
         | UNLESS expression crlf expression_list cons_unless	#unlessclrf         
         ; 
         
cons_unless : ELSE crlf expression_list crlf END
            | crlf END
            ;
cons_if  : ELSIF expression THEN crlf expression_list cons_if
		 | ELSIF expression crlf expression_list cons_if
         | ELSE crlf expression_list END
         | END
         ;
bucle_while : WHILE expression DO crlf expression_list END
	    | WHILE expression terminator 
	    | UNTIL expression crlf DO expression_list END
	    ;
assignment : lvalue ASSIGN rvalue #assi
			;
print : PRINT lvalue #impID
	  | PRINT rvalue #impNum
	  | PRINT string #impString
	  ;
lvalue : ID ;
string : STRING ;
terminator :  terminator crlf           
          	 | crlf
          	 ;
crlf : CRLF;
bool : TRUE | FALSE ;
ASSIGN : '=';
OPCOMP : '==' | '!=' | '=~' | '<=>' | '>' | '>=' | '<' | '<=' | '===' | '!~' ; 

TRUE :'true';
FALSE :'false';
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

STRING : '"'('\\'[bfrnt\\"]|~[\n"EOF])*'"';
INT : [0-9]+;
FLOAT : [0-9]*'.'[0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;

SEMICOLON : ';';
CRLF : '\r'? '\n';

WS : (' '|'\t')+ -> skip ; 
COMMENT: ('#' ~('\r' | '\n')* '\r'? '\n') -> skip;
 


