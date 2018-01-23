//* --------------------------Seccion codigo-usuario ------------------------*/

import java_cup.runtime.*;
%%

/* -----------------Seccion de opciones y declaraciones -----------------*/
/*--OPCIONES --*/
/* Nombre de la clase generada para el analizadorlexico*/

%class analex

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

NL = \n|\r|\r\n
BLANCO = " "
TAB = \t
VAL = "+"|"-"
PUNTO = "."|","|":"
RESERVADA = undef|do|alias|if|while|unless|until|end|return|yield|not|super|"defined?"|elsif|else|case|when|for|in|rescue|ensure|class|module|redo|def|then|nil|break|self
AGRUPACION = and|or
OPERADOR = ".."|"..."|"+"|"-"|"*"|"/"|"%"|"**"
ASIGNACION ="+="|"-="|"*="|"/="|"%="|"**="|"&="|"|="|"^="|"<<="|">>="|"&&="|"||="
COMPARACION = "<=>" | ">" | ">=" | "<" | "<=" | "==" | "!=" | "===" | "=~" | "!~"
LOGICO =  "|" | "^" | "&" | "&&" | "||"
CONCATENACION = "<<"| ">>"
%%
/* ------------------------Seccion de reglas y acciones ----------------------*/
<YYINITIAL> {
\"[:jletterdigit:]*\" {return symbol(sym.STRING, new String(yytext()));}
[1-9][:digit:]* 		{return symbol(sym.INT,new Integer(yytext()));}
{PUNTO} {System.out.println("Token puntuacion <" +yytext()+ "> encontrado");}
{RESERVADA}	{System.out.println("Token Palabra reservada <" +yytext()+ "> encontrado");}
{AGRUPACION} {System.out.println("Token Agrupacion <" +yytext()+ "> encontrado");}
{VAL} {System.out.println("Token valor <" +yytext()+ "> encontrado");}
{OPERADOR} {System.out.println("Token Operador <" + yytext()+ "> encontrado");}
{ASIGNACION} {System.out.println("Token Operador de asignacion <" +yytext()+"> encontrado");}
{COMPARACION} {System.out.println("Token Operador de comparación <" +yytext()+"> encontrado");}
{LOGICO} {System.out.println("Token Operador lógico <" +yytext()+"> encontrado");}
{CONCATENACION} {System.out.println("Token Concatenación <" +yytext()+"> encontrado");}
"(" {System.out.println("Token Apertura Paréntesis <" +yytext()+"> encontrado");}
")" {System.out.println("Token Final Paréntesis <" +yytext()+"> encontrado");}
"[" {System.out.println("Token Apertura Corchete <" +yytext()+"> encontrado");}
"]" {System.out.println("Token Final Corchete <" +yytext()+"> encontrado");}
"$" {System.out.println("Token Global <" +yytext()+"> encontrado");}
"@" {System.out.println("Token @ <" +yytext()+"> encontrado");}
{NL}				{ /* ignoramos los saltos de l�nea y retornos de carro */ }
{TAB}				{ /* ignora los tabuladores */ }
{BLANCO}			{ /* ignora los espacios en blanco */ }
/* Con el inicio de las comillas, hacemos {yybegin(STRING);}
  Cuando alcance el final de las comillas del mismo tipo, hace {yybegin(YYINITIAL);}*/

. 			{System.out.println("Token No Valido <" +yytext()+ ">linea: " + (yyline+1) + " columna: " + (yycolumn+1));}


}/* fin YYinitial */
