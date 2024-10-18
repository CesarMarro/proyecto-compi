/* lexer.flex */
package lexer;

import java_cup.runtime.Symbol;
import parser.sym;

%%

%public
%class Lexer
%unicode
%cup
%line
%column

%{

// Java code, if any, goes here
// You can include additional imports if needed

%}

%%

/* Definition of tokens */

// Ignore whitespace
[ \t\r\n\f]+                      { /* skip whitespace */ }

// Operators
"+"                               { return new Symbol(sym.PLUS, yyline, yycolumn); }
"-"                               { return new Symbol(sym.MINUS, yyline, yycolumn); }
"*"                               { return new Symbol(sym.TIMES, yyline, yycolumn); }
"/"                               { return new Symbol(sym.DIVIDE, yyline, yycolumn); }

// Parentheses
"("                               { return new Symbol(sym.LPAREN, yyline, yycolumn); }
")"                               { return new Symbol(sym.RPAREN, yyline, yycolumn); }

// Numbers (integers and decimals)
[0-9]+(\.[0-9]+)?                 { return new Symbol(sym.NUMBER, yyline, yycolumn, Double.parseDouble(yytext())); }

// Any other character is an error
.                                 { System.err.println("Illegal character: " + yytext()); }