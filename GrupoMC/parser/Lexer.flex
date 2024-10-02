package scanner;


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
continue {lexeme = yytext(); line =yyline; column=yycolumn;return RESERVADAS;}

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
"<"                {return new Symbol(sym.GREATER, yychar, yyline, yytext());}
">" {lexeme = yytext(); line =yyline; column=yycolumn;return MORE_THAN;}
"<=" {lexeme = yytext(); line =yyline; column=yycolumn;return LESS_THAN_OR_EQUAL;}
">=" {lexeme = yytext(); line =yyline; column=yycolumn;return MORE_THAN_OR_EQUAL;}
"==" {lexeme = yytext(); line =yyline; column=yycolumn;return EQUAL;}
"!=" {lexeme = yytext(); line =yyline; column=yycolumn;return DIFFERENT;}
"&&" {lexeme = yytext(); line =yyline; column=yycolumn;return AND;}
"||" {lexeme = yytext(); line =yyline; column=yycolumn;return OR;}

"{" {lexeme = yytext(); line =yyline; column=yycolumn;return OPEN_BRACE;}
"}" {lexeme = yytext(); line =yyline; column=yycolumn;return CLOSE_BRACE;}
"[" {lexeme = yytext(); line =yyline; column=yycolumn;return OPEN_BRACKET;}
"]" {lexeme = yytext(); line =yyline; column=yycolumn;return CLOSE_BRACKET;}
"(" {lexeme = yytext(); line =yyline; column=yycolumn;return OPEN_PARE;}
")" {lexeme = yytext(); line =yyline; column=yycolumn;return CLOSE_PARE;}
"!" {lexeme = yytext(); line =yyline; column=yycolumn;return NOT;}
";" {lexeme = yytext(); line =yyline; column=yycolumn;return SEMICOLON;}
"," {lexeme = yytext(); line =yyline; column=yycolumn;return COMMA;}
"." {lexeme = yytext(); line =yyline; column=yycolumn;return DOT;}

{char_literal} {lexeme = yytext(); line =yyline; column=yycolumn;return CHAR_LITERAL;}
{string_literal} {lexeme = yytext(); line =yyline; column=yycolumn;return STRING_LITERAL;}
{hex_literal} {lexeme = yytext(); line =yyline; column=yycolumn;return HEX_LITERAL;}
{int_literal} {lexeme = yytext(); line =yyline; column=yycolumn;return INT_LITERAL;}
{hex_digit} {lexeme = yytext(); line =yyline; column=yycolumn;return HEX_DIGIT;}
{id} {lexeme = yytext(); line =yyline; column=yycolumn;return ID;}


 . {lexeme = yytext(); line =yyline; column=yycolumn;return ERROR;}