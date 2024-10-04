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

int                     {return new Symbol(sym.INT, (int)yychar, yyline, yytext());}
callout                 {return new Symbol(sym.CALLOUT, (int)yychar, yyline, yytext());}
if                      {return new Symbol(sym.IF, (int)yychar, yyline, yytext());}
for                     {return new Symbol(sym.FOR, (int)yychar, yyline, yytext());}
while                   {return new Symbol(sym.WHILE, (int)yychar, yyline, yytext());}
else                    {return new Symbol(sym.ELSE, (int)yychar, yyline, yytext());}
return                  {return new Symbol(sym.RETURN, (int)yychar, yyline, yytext());}
break                   {return new Symbol(sym.BREAK, (int)yychar, yyline, yytext());}
true                    {return new Symbol(sym.TRUE, (int)yychar, yyline, yytext());}
false                   {return new Symbol(sym.FALSE, (int)yychar, yyline, yytext());}
void                    {return new Symbol(sym.VOID, (int)yychar, yyline, yytext());}
Program                 {return new Symbol(sym.PROGRAM, (int)yychar, yyline, yytext());}
class                   {return new Symbol(sym.CLASS, (int)yychar, yyline, yytext());}
boolean                 {return new Symbol(sym.BOOLEAN, (int)yychar, yyline, yytext());}
type                    {return new Symbol(sym.TYPE, (int)yychar, yyline, yytext());}
main                    {return new Symbol(sym.MAIN, (int)yychar, yyline, yytext());}
VarDecl                 {return new Symbol(sym.VARDECL, (int)yychar, yyline, yytext());}
FunDecl                 {return new Symbol(sym.FUNDECL, (int)yychar, yyline, yytext());}
Block                   {return new Symbol(sym.BLOCK, (int)yychar, yyline, yytext());}
continue                 {return new Symbol(sym.CONTINUE, (int)yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}



"="                {return new Symbol(sym.ASSIGN, (int)yychar, yyline, yytext());}
"-="               {return new Symbol(sym.SUS_ASIGN, (int)yychar, yyline, yytext());}
"+="               {return new Symbol(sym.SUM_ASIGN, (int)yychar, yyline, yytext());}
"+"                {return new Symbol(sym.SUM, (int)yychar, yyline, yytext());}
"-"                {return new Symbol(sym.SUS, (int)yychar, yyline, yytext());}
"*"                {return new Symbol(sym.MULTIPLICATION, (int)yychar, yyline, yytext());}
"/"                {return new Symbol(sym.DIVIDE, (int)yychar, yyline, yytext());}
"%"                {return new Symbol(sym.MOD, (int)yychar, yyline, yytext());}
"<"                {return new Symbol(sym.LESS_THAN, (int)yychar, yyline, yytext());}
">"                {return new Symbol(sym.MORE_THAN, (int)yychar, yyline, yytext());}
"<="                {return new Symbol(sym.LESS_THAN_OR_EQUAL, (int)yychar, yyline, yytext());}
">="                {return new Symbol(sym.MORE_THAN_OR_EQUAL, (int)yychar, yyline, yytext());}
"=="                {return new Symbol(sym.EQUAL, (int)yychar, yyline, yytext());}
"!="                {return new Symbol(sym.DIFFERENT, (int)yychar, yyline, yytext());}
"&&"                {return new Symbol(sym.AND, (int)yychar, yyline, yytext());}
"||"                {return new Symbol(sym.OR, (int)yychar, yyline, yytext());}

"{"                {return new Symbol(sym.OPEN_BRACE, (int)yychar, yyline, yytext());}
"}"                {return new Symbol(sym.CLOSE_BRACE, (int)yychar, yyline, yytext());}
"["                {return new Symbol(sym.OPEN_BRACKET, (int)yychar, yyline, yytext());}
"]"                {return new Symbol(sym.CLOSE_BRACKET, (int)yychar, yyline, yytext());}
"("                {return new Symbol(sym.OPEN_PARE, (int)yychar, yyline, yytext());}
")"                {return new Symbol(sym.CLOSE_PARE, (int)yychar, yyline, yytext());}
"!"                {return new Symbol(sym.NOT, (int)yychar, yyline, yytext());}
";"                {return new Symbol(sym.SEMICOLON, (int)yychar, yyline, yytext());}
","                {return new Symbol(sym.COMMA, (int)yychar, yyline, yytext());}
"."                {return new Symbol(sym.DOT, (int)yychar, yyline, yytext());}

{char_literal}                 {return new Symbol(sym.CHAR_LITERAL, (int)yychar, yyline, yytext());}
{string_literal}                 {return new Symbol(sym.STRING_LITERAL, (int)yychar, yyline, yytext());}
{hex_literal}                {return new Symbol(sym.HEX_LITERAL, (int)yychar, yyline, yytext());}
{int_literal}                {return new Symbol(sym.INT_LITERAL, (int)yychar, yyline, yytext());}
{hex_digit}                {return new Symbol(sym.HEX_DIGIT, (int)yychar, yyline, yytext());}
{id}                {return new Symbol(sym.ID, (int)yychar, yyline, yytext());}


 .                {return new Symbol(sym.ERROR, (int)yychar, yyline, yytext());}



