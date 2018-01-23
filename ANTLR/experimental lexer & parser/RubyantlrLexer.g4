lexer grammar RubyantlrLexer;


// -------------------------
// Comments

ASSIGN : '=';
OPCOMP : '==' | '!=' | '=~' | '<=>' | '>' | '>=' | '<' | '<=' | '===' | '!~' ; 
WHILE : 'while' ;
UNTIL : 'until' ;
UNLESS : 'unless' ;
IF : 'if' ;
DO : 'do' ;
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
CRLF : '\n'|'\r';

WS : (' '|'\t'| '\n')+ -> skip ; 