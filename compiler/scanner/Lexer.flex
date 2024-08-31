package scanner;
import static scanner.Tokens.*;

%%
%class Lexer
%type Tokens

true="true"
false="false"
bool_literal=({true}|{false})

alpha=[a-zA-Z] 
char=({alpha})+
char_literal=[']{alpha}[']
string_literal=["]{alpha}*["]

digit=[0-9]
alpha_num={alpha}|{digit}
id = {alpha}{alpha_num}*


hex_digit={digit}|[a-fA-F]
hex_literal=0[xX]{hex_digit}{hex_digit}*
decimal_literal={digit}({digit})*
int_literal={decimal_literal}|{hex_literal}


literal = {int_literal}|{char_literal}|{bool_literal}


espacio=[ \t\r\n]+

%{
    public String lexeme;
%}

%%


{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}



"while" {return WHILE;}
"=" {return ASIGN;}
"-=" {return SUS_ASIGN;}
"+=" {return SUM_ASIGN;}
"+" {return SUM;}
"-" {return SUS;}
"*" {return MULTIPLICATION;}
"/" {return DIVIDE;}
"%" {return MOD;}
"<" {return LESS_THAN;}
">" {return MORE_THAN;}
"<=" {return LESS_THAN_OR_EQUAL;}
">=" {return MORE_THAN_OR_EQUAL;}
"==" {return EQUAL;}
"!=" {return DIFFERENT;}
"&&" {return AND;}
"||" {return OR;}

"{" {return OPEN_BRACE;}
"}" {return CLOSE_BRACE;}
"[" {return OPEN_BRACKET;}
"]" {return CLOSE_BRACKET;}
"(" {return OPEN_PAREN;}
")" {return CLOSE_PAREN;}
"[]" {return BRACES;}
"!" {return NOT;}
";" {return SEMICOLON;}
"," {return COMMA;}
"." {return DOT;}



"class" {return CLASS;}
"program" {return PROGRAM;}
"field_decl" {return FIELD_DECL;}
"method_decl" {return METHOD_DECL;}
"block" {return BLOCK;}
"var_decl" {return VAR_DECL;}
"type" {return TYPE;}
"void" {return VOID;}
"int" {return INT;}
"boolean" {return BOOLEAN;}
"expr" {return EXPR;}
"if" {return IF;}
"else" {return ELSE;}
"for" {return FOR;}
"return" {return RETURN;}
"break" {return BREAK;}
"literal" {return LITERAL;}
"true" {return TRUE;}
"false" {return FALSE;}
"char" {return CHAR;}
"break" {return BREAK;}
"callout" {return CALLOUT;}
"continue" {return CONTINUE;}


{char_literal} {lexeme=yytext(); return CHAR_LITERAL;}
{string_literal} {lexeme=yytext(); return STRING_LITERAL;}
{hex_literal} {lexeme=yytext(); return HEX_LITERAL;}
{int_literal} {lexeme=yytext(); return INT_LITERAL;}
{hex_digit} {lexeme=yytext(); return HEX_DIGIT;}
{id} {lexeme=yytext(); return ID;}


 . {return ERROR;}