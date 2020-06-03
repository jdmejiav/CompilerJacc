// Analizador Léxico
import java.io.IOException;
import co.edu.eafit.dis.st0270.s20201.NanoTokens;
package co.edu.eafit.dis.st0270.s20201.nano;
%%
%class NanoLexer
%int
%line
%column
%public
%implements NanoTokens
%{
	private int token;

	public int nextToken(){
		try{
			token=yylex();
		}catch(IOException e){
			System.err.println("Exceción del analizador léxico" + e);
			System.exit(1);
		}
		return token;
	}
	public int getToken(){
		return token;
	}
	public int getSemantic(){
		return token;
	}

%}

LineTerminator		= \r|\n|\r\n
WhiteSpace		= {LineTerminator} | [\t\n]
Lower			= "q"|"w"|"e"|"r"|"t"|"y"|"u"|"i"|"o"|"p"|"a"|"s"|"d"|"f"|"g"|"h"|"j"|"k"|"l"|"ñ"|"z"|"x"|"c"|"v"|"b"|"n"|"m"
Upper			= "Q"|"W"|"E"|"R"|"T"|"Y"|"U"|"I"|"O"|"P"|"A"|"S"|"D"|"F"|"G"|"H"|"J"|"K"|"L"|"Ñ"|"Z"|"X"|"C"|"V"|"B"|"N"|"M"

%%
"::="			    {return (token = ASIGNACION);}
"|"			        {return (token = BARRA);	 }
","			        {return (token = COMA);		 }
{Lower}			    {return (token = MINUSCULA); }
{Upper}			    {return (token = MAYUSCULA); }
{WhiteSpace}		{				             }
{LineTerminator}	{				             }
<<EOF>>			    {return (token = ENDINPUT);	 }
.			        {return (token = error);	 }
