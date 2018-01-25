//* --------------------------Seccion codigo-usuario ------------------------*/

import java_cup.runtime.*;
%%

/* -----------------Seccion de opciones y declaraciones -----------------*/
/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/

%class Yylex

/* Indicar funcionamientoautonomo*/


/* Posibilitar acceso a la columna y fila actual de analisis*/

%line

%column


%cup


/*--DECLARACIONES --*/

%{
  private Symbol symbol(int type) {

     return new Symbol(type,yyline,yycolumn);

   }

  private Symbol symbol(int type,Object value){
  	return new Symbol(type,yyline,yycolumn,value);
  }
 /* Fin Declaraciones */
%}

/* Declaraciones de macros NL(nueva linea) BLANCO(espacio en blanco) y TAB(tabulador) */
ID= [a-zA-Z]+[a-zA-Z0-9"_""-"]*
NL = \n|\r;
BLANCO = " "
TAB = \t
PUNTO = "."|","|":";
//OPERADOR = ".."|"..."|"+"|"-"|"*"|"/"|"%"|"**";
ASIGNACION ="+="|"-="|"*="|"/="|"%="|"**="|"&="|"|="|"^="|"<<="|">>="|"&&="|"||="|"=";
COMPARACION =  > | >= | < | <= | == | !=;
LOGICO =  "|" | "^" | "&" | "&&" | "||"|"and"|"or";
CONCATENACION = "<<"| ">>";
%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
//"undef"	{return symbol(sym.UNDEF);}
//"do"	{return symbol(sym.DO);}
//"alias"	{return symbol(sym.ALIAS);}
"if"	{return symbol(sym.IF);}
//"while"	{return symbol(sym.WHILE);}
//"unless"	{return symbol(sym.UNLESS);}
//"until"	{return symbol(sym.UNTIL);}
"end"	{return symbol(sym.END);}
//"return"	{return symbol(sym.RETURN);}
//"yield"	{return symbol(sym.YIELD);}
//"not"	{return symbol(sym.NOT);}
//"super"	{return symbol(sym.SUPER);}
//"defined?"	{return symbol(sym.DEFINED);}
//"elsif"	{return symbol(sym.ELSIF);}
"else"	{return symbol(sym.ELSE);}
"puts" {return symbol(sym.PUTS);}
"true" | "false" {return symbol(sym.BOOLEAN,new Boolean(yytext()));}
//"case"	{return symbol(sym.CASE);}
//"when"	{return symbol(sym.WHEN);}
//"for"	{return symbol(sym.FOR);}
//"in"	{return symbol(sym.IN);}
//"rescue"	{return symbol(sym.RESCUE);}
//"ensure"	{return symbol(sym.ENSURE);}
//"class"	{return symbol(sym.CLASS);}
//"module"	{return symbol(sym.MODULE);}
//"redo"	{return symbol(sym.REDO);}
//"def"	{return symbol(sym.DEF);}
"then"	{return symbol(sym.THEN);}
//"nil"	{return symbol(sym.NIL);}
//"break"	{return symbol(sym.BREAK);}
//"self"	{return symbol(sym.SELF);}
//{LOGICO} {return symbol(sym.LOGICO,new String(yytext()));}
//. {return symbol(sym.PUNTO);}
//, {return symbol(sym.COMA);}
//\"[:jletterdigit:]*\" {return symbol(sym.STRING, new String(yytext()));}
[0-9]+ 		{return symbol(sym.INT,new Integer(yytext()));}
//[0-9]+"."([0-9]+) {return symbol(sym.DOUBLE,new Double(yytext()));}
{ID} {return symbol(sym.ID, new String(yytext()));}
//"(" {return symbol(sym.PA);}
//")" {return symbol(sym.PC);}
//"[" {return symbol(sym.CA);}
//"]" {return symbol(sym.CC);}
//"$" {return symbol(sym.GLOBAL);}
//"@" {return symbol(sym.ARROBA);}
"+" {return symbol(sym.PLUS);}
"-" {return symbol(sym.MINUS);}
"*" {return symbol(sym.MUL);}
"/" {return symbol(sym.DIV);}
//{OPERADOR} {return symbol(sym.OPERADOR, new String(yytext()));}
//"\""~"\"" {return symbol(sym.LITERAL, new String(yytext()));}

//; {return symbol(sym.SEMICOLON);}
{ASIGNACION} {return symbol(sym.ASIGNACION, new String(yytext()));}
//{COMPARACION} {return symbol(sym.COMPARACION, new String(yytext()));}
//{CONCATENACION} {return symbol(sym.CONCATENACION, new String(yytext()));}

{NL}				{ return symbol(sym.CRLF); }
{TAB}				{ /* ignora los tabuladores */ }
{BLANCO}			{ /* ignora los espacios en blanco */ }
/* Con el inicio de las comillas, hacemos {yybegin(STRING);}
  Cuando alcance el final de las comillas del mismo tipo, hace {yybegin(YYINITIAL);}*/

. 			{System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */
