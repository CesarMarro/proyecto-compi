package parser;


import java_cup.runtime.Symbol;
%%
%class Lexer
%type java_cup.runtime.Symbol
%cup 
%full
%line
%char

string_literal = ([\"][^\".]+[\"])
char_literal = ([\'][^\'.][\'])
alpha=[a-zA-Z] 
digit=[0-9]

alpha_num={alpha}|{digit}
id = {alpha}{alpha_num}*


hex_digit={digit}|[a-fA-F]
hex_literal=0[xX]{hex_digit}{hex_digit}*
decimal_literal={digit}({digit})*
int_literal={decimal_literal}|{hex_literal}


espacio=[ \t\r\n]+

%{
    public String lexeme;
    public int line;
    public int column;

        // Getter method for line
    public int getLine() {
        return line;
    }

    // Getter method for column
    public int getColumn() {
        return column;
    }
%}

%%

int|
callout|
if|
for|
while|
else|
return|
break|
true|
false|
void|
Program|
class|
boolean|
type|
true|
main|
false|
VarDecl|
FunDecl|
Block|
continue                 {return new Symbol(sym.RESERVADAS, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}



"="                {return new Symbol(sym.ASSIGN, yychar, yyline, yytext());}
"-="               {return new Symbol(sym.SUS_ASIGN, yychar, yyline, yytext());}
"+="               {return new Symbol(sym.SUM_ASIGN, yychar, yyline, yytext());}
"+"                {return new Symbol(sym.SUM, yychar, yyline, yytext());}
"-"                {return new Symbol(sym.SUS, yychar, yyline, yytext());}
"*"                {return new Symbol(sym.MULTIPLICATION, yychar, yyline, yytext());}
"/"                {return new Symbol(sym.DIVIDE, yychar, yyline, yytext());}
"%"                {return new Symbol(sym.MOD, yychar, yyline, yytext());}
"<"                {return new Symbol(sym.LESS_THAN, yychar, yyline, yytext());}
">"                {return new Symbol(sym.MORE_THAN, yychar, yyline, yytext());}
"<="                {return new Symbol(sym.LESS_THAN_OR_EQUAL, yychar, yyline, yytext());}
">="                {return new Symbol(sym.MORE_THAN_OR_EQUAL, yychar, yyline, yytext());}
"=="                {return new Symbol(sym.EQUAL, yychar, yyline, yytext());}
"!="                {return new Symbol(sym.DIFFERENT, yychar, yyline, yytext());}
"&&"                {return new Symbol(sym.AND, yychar, yyline, yytext());}
"||"                {return new Symbol(sym.OR, yychar, yyline, yytext());}

"{"                {return new Symbol(sym.OPEN_BRACE, yychar, yyline, yytext());}
"}"                {return new Symbol(sym.CLOSE_BRACE, yychar, yyline, yytext());}
"["                {return new Symbol(sym.OPEN_BRACKET, yychar, yyline, yytext());}
"]"                {return new Symbol(sym.CLOSE_BRACKET, yychar, yyline, yytext());}
"("                {return new Symbol(sym.OPEN_PARE, yychar, yyline, yytext());}
")"                {return new Symbol(sym.CLOSE_PARE, yychar, yyline, yytext());}
"!"                {return new Symbol(sym.NOT, yychar, yyline, yytext());}
";"                {return new Symbol(sym.SEMICOLON, yychar, yyline, yytext());}
","                {return new Symbol(sym.COMMA, yychar, yyline, yytext());}
"."                {return new Symbol(sym.DOT, yychar, yyline, yytext());}

{char_literal}                 {return new Symbol(sym.CHAR_LITERAL, yychar, yyline, yytext());}
{string_literal}                 {return new Symbol(sym.STRING_LITERAL, yychar, yyline, yytext());}
{hex_literal}                {return new Symbol(sym.HEX_LITERAL, yychar, yyline, yytext());}
{int_literal}                {return new Symbol(sym.INT_LITERAL, yychar, yyline, yytext());}
{hex_digit}                {return new Symbol(sym.HEX_DIGIT, yychar, yyline, yytext());}
{id}                {return new Symbol(sym.ID, yychar, yyline, yytext());}


 .                {return new Symbol(sym.ERROR, yychar, yyline, yytext());}