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
expression : rvalue {System.out.println($rvalue.v);};
      | lvalue
      | bvalue
      | bucle_if
      | bucle_while ;
rvalue returns [int v] : assignment {$v=$assignment.v;}
         | rvalue op rvalue  {$v = eval($rvalue.v, $op.type, $rvalue.v);}
         | INT  {$v = $INT.int;} ;
         
bvalue : rvalue OPCOMP rvalue ;
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
lvalue : ID ;
terminator : terminator SEMICOLON
           | terminator crlf
           | SEMICOLON
           | crlf
           ;
crlf : CRLF;
op returns [char type] : PLUS {$op.type = '+'} 
	| MINUS {$op.type = '-'} 
	| DIV {$op.type = '/'} 
	| MUL {$op.type = '*'} ;
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
