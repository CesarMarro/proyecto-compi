package scanner;
import static scanner.Tokens.*;

%%
%class Lexer
%type Tokens
%line
%column


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
program|
class|
boolean|
type|
true|
main|
false|
continue {lexeme = yytext(); line =yyline; column=yycolumn;return RESERVADAS;}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}



"=" {lexeme = yytext(); line =yyline; column=yycolumn;return ASSIGN;}
"-=" {lexeme = yytext(); line =yyline; column=yycolumn;return SUS_ASIGN;}
"+=" {lexeme = yytext(); line =yyline; column=yycolumn;return SUM_ASIGN;}
"+" {lexeme = yytext(); line =yyline; column=yycolumn;return SUM;}
"-" {lexeme = yytext(); line =yyline; column=yycolumn;return SUS;}
"*" {lexeme = yytext(); line =yyline; column=yycolumn;return MULTIPLICATION;}
"/" {lexeme = yytext(); line =yyline; column=yycolumn;return DIVIDE;}
"%" {lexeme = yytext(); line =yyline; column=yycolumn;return MOD;}
"<" {lexeme = yytext(); line =yyline; column=yycolumn;return LESS_THAN;}
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