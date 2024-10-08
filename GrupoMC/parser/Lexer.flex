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

// PALABRAS RESERVADAS
// TERMINALES EN NEGRILLA

"class" { return new Symbol(sym.CLASS, yyline + 1, yycolumn + 1, yytext()); }
"Program" { return new Symbol(sym.PROGRAM, yyline + 1, yycolumn + 1, yytext()); }
"void" { return new Symbol(sym.VOID, yyline + 1, yycolumn + 1, yytext()); }
"int" { return new Symbol(sym.INT, yyline + 1, yycolumn + 1, yytext()); }
"boolean" { return new Symbol(sym.BOOLEAN, yyline + 1, yycolumn + 1, yytext()); }
"if" { return new Symbol(sym.IF, yyline + 1, yycolumn + 1, yytext()); }
"else" { return new Symbol(sym.ELSE, yyline + 1, yycolumn + 1, yytext()); }
"for" { return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext()); }
"return" { return new Symbol(sym.RETURN, yyline + 1, yycolumn + 1, yytext()); }
"break" { return new Symbol(sym.BREAK, yyline + 1, yycolumn + 1, yytext()); }
"continue" { return new Symbol(sym.CONTINUE, yyline + 1, yycolumn + 1, yytext()); }
"callout" { return new Symbol(sym.CALLOUT, yyline + 1, yycolumn + 1, yytext()); }
"true" { return new Symbol(sym.TRUE, yyline + 1, yycolumn + 1, yytext()); }
"false" { return new Symbol(sym.FALSE, yyline + 1, yycolumn + 1, yytext()); }

{espacio} { /* Ignore whitespace */ }
"//".* { /* Ignore comments */ }
"/*"([^*]|\*+[^*/])*\*+\/ { /*Ignore*/ }

// SYMBOLS AND OPERATORS
"=" { return new Symbol(sym.ASSIGN, yyline + 1, yycolumn + 1, yytext()); }
"-=" { return new Symbol(sym.SUS_ASIGN, yyline + 1, yycolumn + 1, yytext()); }
"+=" { return new Symbol(sym.SUM_ASIGN, yyline + 1, yycolumn + 1, yytext()); }
"+" { return new Symbol(sym.SUM, yyline + 1, yycolumn + 1, yytext()); }
"-" { return new Symbol(sym.SUS, yyline + 1, yycolumn + 1, yytext()); }
"*" { return new Symbol(sym.MULTIPLICATION, yyline + 1, yycolumn + 1, yytext()); }
"/" { return new Symbol(sym.DIVIDE, yyline + 1, yycolumn + 1, yytext()); }
"%" { return new Symbol(sym.MOD, yyline + 1, yycolumn + 1, yytext()); }

// COMPARISONS AND LOGIC
"<" { return new Symbol(sym.LESS_THAN, yyline + 1, yycolumn + 1, yytext()); }
">" { return new Symbol(sym.MORE_THAN, yyline + 1, yycolumn + 1, yytext()); }
"<=" { return new Symbol(sym.LESS_THAN_OR_EQUAL, yyline + 1, yycolumn + 1, yytext()); }
">=" { return new Symbol(sym.MORE_THAN_OR_EQUAL, yyline + 1, yycolumn + 1, yytext()); }
"==" { return new Symbol(sym.EQUAL, yyline + 1, yycolumn + 1, yytext()); }
"!=" { return new Symbol(sym.DIFFERENT, yyline + 1, yycolumn + 1, yytext()); }
"&&" { return new Symbol(sym.AND, yyline + 1, yycolumn + 1, yytext()); }
"||" { return new Symbol(sym.OR, yyline + 1, yycolumn + 1, yytext()); }

// BRACES AND BRACKETS
"{" { return new Symbol(sym.OPEN_BRACE, yyline + 1, yycolumn + 1, yytext()); }
"}" { return new Symbol(sym.CLOSE_BRACE, yyline + 1, yycolumn + 1, yytext()); }
"[" { return new Symbol(sym.OPEN_BRACKET, yyline + 1, yycolumn + 1, yytext()); }
"]" { return new Symbol(sym.CLOSE_BRACKET, yyline + 1, yycolumn + 1, yytext()); }
"(" { return new Symbol(sym.OPEN_PARE, yyline + 1, yycolumn + 1, yytext()); }
")" { return new Symbol(sym.CLOSE_PARE, yyline + 1, yycolumn + 1, yytext()); }

// OTHERS
"!" { return new Symbol(sym.NOT, yyline + 1, yycolumn + 1, yytext()); }
";" { return new Symbol(sym.SEMICOLON, yyline + 1, yycolumn + 1, yytext()); }
"," { return new Symbol(sym.COMMA, yyline + 1, yycolumn + 1, yytext()); }
"." { return new Symbol(sym.DOT, yyline + 1, yycolumn + 1, yytext()); }

{char_literal} { return new Symbol(sym.CHAR_LITERAL, yyline + 1, yycolumn + 1, yytext()); }
{string_literal} { return new Symbol(sym.STRING_LITERAL, yyline + 1, yycolumn + 1, yytext()); }
{hex_literal} { return new Symbol(sym.HEX_LITERAL, yyline + 1, yycolumn + 1, yytext()); }
{int_literal} { return new Symbol(sym.INT_LITERAL, yyline + 1, yycolumn + 1, yytext()); }
{hex_digit} { return new Symbol(sym.HEX_DIGIT, yyline + 1, yycolumn + 1, yytext()); }
{id} { return new Symbol(sym.ID, yyline + 1, yycolumn + 1, yytext()); }

. { return new Symbol(sym.ERROR, yyline + 1, yycolumn + 1, yytext()); }
