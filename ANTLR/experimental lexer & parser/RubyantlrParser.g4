parser grammar RubyantlrParser;

prog  : expression_list;
expression_list : expression_list expression terminator
                  | expression terminator ;
expression : rvalue;
rvalue : assignment 
         | bucle_if 
	 | bucle_while
         | rvalue OPCOMP rvalue
         | rvalue MUL rvalue 
         | rvalue DIV rvalue 
         | rvalue PLUS rvalue 
         | rvalue MINUS rvalue
         | lvalue
         | INT
         | FLOAT ;

bucle_if : IF expression THEN expression_list cons_if 
         | UNLESS expression THEN expression_list cons_unless
         ; 
cons_unless : ELSE expression_list END
            | END
            ;
bucle_while : WHILE expression DO expression_list END
	    | WHILE expression terminator 
	    | UNTIL expression DO expression_list END
	    ;
cons_if  : ELSIF expression THEN expression_list cons_if
         | ELSE expression_list END
         | END
         ;

assignment : lvalue ASSIGN rvalue;
lvalue : ID ;
terminator : SEMICOLON 
		   | CRLF
		   ;