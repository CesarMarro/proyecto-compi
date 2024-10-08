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

//PALABRAS RESERVADAS
//TERMINALES EN NEGRILLA

"class" {lexeme = yytext(); return new Symbol(sym.CLASS, yychar, yyline, yytext());}
"Program" {lexeme = yytext(); return new Symbol(sym.PROGRAM, yychar, yyline, yytext());}
"void" {lexeme = yytext(); return new Symbol(sym.VOID, yychar, yyline, yytext());}
"int" {lexeme = yytext(); return new Symbol(sym.INT, yychar, yyline, yytext());}
"boolean" {lexeme = yytext(); return new Symbol(sym.BOOLEAN, yychar, yyline, yytext());}
"if" {lexeme = yytext(); return new Symbol(sym.IF, yychar, yyline, yytext());}
"else" {lexeme = yytext(); return new Symbol(sym.ELSE, yychar, yyline, yytext());}
"for" {lexeme = yytext(); return new Symbol(sym.FOR, yychar, yyline, yytext());}
"return" {lexeme = yytext(); return new Symbol(sym.RETURN, yychar, yyline, yytext());}
"break" {lexeme = yytext(); return new Symbol(sym.BREAK, yychar, yyline, yytext());}
"continue" {lexeme = yytext(); return new Symbol(sym.CONTINUE, yychar, yyline, yytext());}
"callout" {lexeme = yytext(); return new Symbol(sym.CALLOUT, yychar, yyline, yytext());}
"true" {lexeme = yytext(); return new Symbol(sym.TRUE, yychar, yyline, yytext());}
"false" {lexeme = yytext(); return new Symbol(sym.FALSE, yychar, yyline, yytext());}

{espacio} {/*Ignore*/}
"//".* {/*Ignore*/}


//TODO ESTO ES TERMINAL TAMBIÉN
//PRIMER BLOQUE DEL PARSER
"="                {return new Symbol(sym.ASSIGN, yychar, yyline, yytext());}
"-="               {return new Symbol(sym.SUS_ASIGN, yychar, yyline, yytext());}
"+="               {return new Symbol(sym.SUM_ASIGN, yychar, yyline, yytext());}
"+"                {return new Symbol(sym.SUM, yychar, yyline, yytext());}
"-"                {return new Symbol(sym.SUS, yychar, yyline, yytext());}
"*"                {return new Symbol(sym.MULTIPLICATION, yychar, yyline, yytext());}
"/"                {return new Symbol(sym.DIVIDE, yychar, yyline, yytext());}
"%"                {return new Symbol(sym.MOD, yychar, yyline, yytext());}

//SEGUNDO BLOQUE DE TERMINALS
"<"                {return new Symbol(sym.LESS_THAN, yychar, yyline, yytext());}
">"                {return new Symbol(sym.MORE_THAN, yychar, yyline, yytext());}
"<="                {return new Symbol(sym.LESS_THAN_OR_EQUAL, yychar, yyline, yytext());}
">="                {return new Symbol(sym.MORE_THAN_OR_EQUAL, yychar, yyline, yytext());}
"=="                {return new Symbol(sym.EQUAL, yychar, yyline, yytext());}
"!="                {return new Symbol(sym.DIFFERENT, yychar, yyline, yytext());}
"&&"                {return new Symbol(sym.AND, yychar, yyline, yytext());}
"||"                {return new Symbol(sym.OR, yychar, yyline, yytext());}

//TERCER BLOQUE DE TERMINALS
"{"                {return new Symbol(sym.OPEN_BRACE, yychar, yyline, yytext());}
"}"                {return new Symbol(sym.CLOSE_BRACE, yychar, yyline, yytext());}
"["                {return new Symbol(sym.OPEN_BRACKET, yychar, yyline, yytext());}
"]"                {return new Symbol(sym.CLOSE_BRACKET, yychar, yyline, yytext());}
"("                {return new Symbol(sym.OPEN_PARE, yychar, yyline, yytext());}
")"                {return new Symbol(sym.CLOSE_PARE, yychar, yyline, yytext());}

//CUARTO BLOQUE DE TERMINALS
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

"class" { return new Symbol(sym.CLASS); }
"Program" { return new Symbol(sym.PROGRAM); }
"void" { return new Symbol(sym.VOID); }
"int" { return new Symbol(sym.INT); }
"boolean" { return new Symbol(sym.BOOLEAN); }
"if" { return new Symbol(sym.IF); }
"else" { return new Symbol(sym.ELSE); }
"for" { return new Symbol(sym.FOR); }
"return" { return new Symbol(sym.RETURN); }
"break" { return new Symbol(sym.BREAK); }
"continue" { return new Symbol(sym.CONTINUE); }
"callout" { return new Symbol(sym.CALLOUT); }
"true" { return new Symbol(sym.TRUE); }
"false" { return new Symbol(sym.FALSE); }

{espacio} {/* Ignore */}
"//".* {/* Ignore */}

// TODO ESTO ES TERMINAL TAMBIÉN
// PRIMER BLOQUE DEL PARSER
"=" { return new Symbol(sym.ASSIGN); }
"-=" { return new Symbol(sym.SUS_ASIGN); }
"+=" { return new Symbol(sym.SUM_ASIGN); }
"+" { return new Symbol(sym.SUM); }
"-" { return new Symbol(sym.SUS); }
"*" { return new Symbol(sym.MULTIPLICATION); }
"/" { return new Symbol(sym.DIVIDE); }
"%" { return new Symbol(sym.MOD); }

// SEGUNDO BLOQUE DE TERMINALS
"<" { return new Symbol(sym.LESS_THAN); }
">" { return new Symbol(sym.MORE_THAN); }
"<=" { return new Symbol(sym.LESS_THAN_OR_EQUAL); }
">=" { return new Symbol(sym.MORE_THAN_OR_EQUAL); }
"==" { return new Symbol(sym.EQUAL); }
"!=" { return new Symbol(sym.DIFFERENT); }
"&&" { return new Symbol(sym.AND); }
"||" { return new Symbol(sym.OR); }

// TERCER BLOQUE DE TERMINALS
"{" { return new Symbol(sym.OPEN_BRACE); }
"}" { return new Symbol(sym.CLOSE_BRACE); }
"[" { return new Symbol(sym.OPEN_BRACKET); }
"]" { return new Symbol(sym.CLOSE_BRACKET); }
"(" { return new Symbol(sym.OPEN_PARE); }
")" { return new Symbol(sym.CLOSE_PARE); }

// CUARTO BLOQUE DE TERMINALS
"!" { return new Symbol(sym.NOT); }
";" { return new Symbol(sym.SEMICOLON); }
"," { return new Symbol(sym.COMMA); }
"." { return new Symbol(sym.DOT); }

{char_literal} { return new Symbol(sym.CHAR_LITERAL); }
{string_literal} { return new Symbol(sym.STRING_LITERAL); }
{hex_literal} { return new Symbol(sym.HEX_LITERAL); }
{int_literal} { return new Symbol(sym.INT_LITERAL); }
{hex_digit} { return new Symbol(sym.HEX_DIGIT); }
{id} { return new Symbol(sym.ID); }

. { return new Symbol(sym.ERROR); }
