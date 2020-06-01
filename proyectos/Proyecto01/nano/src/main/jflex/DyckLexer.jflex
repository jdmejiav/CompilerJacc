/* Analizador lexico para el lenguaje de parentesis (Dyck) */
package co.edu.eafit.dis.st0270.s20201.nano.lexer;

import co.edu.eafit.dis.st0270.s20201.nano.grammar.Terminal;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Asignacion;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Palito;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Coma;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.May;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Min;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.EndOfString;

%%

%class DyckLexer
%unicode
%line
%column
%function getNextToken
%type Terminal
%public

LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\n]

%%

"::="                  { return new Asignacion(yycolumn + 1, yyline + 1); }
"|"                  { return new Palito(yycolumn + 1, yyline + 1); }
","                  { return new Coma(yycolumn + 1, yyline + 1); }
[A-Z]                  { return new May(yycolumn + 1, yyline + 1); }
[a-z]                  { return new Min(yycolumn + 1, yyline + 1); }
{WhiteSpace}         { }
.                    { throw new Error("Illegal character <" +
                                       yytext() + "> at line: " +
                                       (yyline + 1) + " column: " +
                                       yycolumn);
                     }
<<EOF>>              { return new EndOfString(); }
