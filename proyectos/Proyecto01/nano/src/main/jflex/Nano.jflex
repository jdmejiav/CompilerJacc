// Analizador Léxico
package co.edu.eafit.dis.st0270.s20201.nano.lexer;
import java.io.IOException;
import co.edu.eafit.dis.st0270.s20201.nano.parser.NanoTokens;
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
Lower			= [a-z]
Upper			= [A-Z]
Coma =","
Palito="|"
Asignacion="::="

%%
{Asignacion}		    	{return (token = ASIGNACION);	}
{Palito}			        {return (token = BARRA);	 		}
{Coma}			        	{return (token = COMA);		 		}
{Lower}			    			{return (token = MINUSCULA); 	}
{Upper}			   				{return (token = MAYUSCULA); 	}
{WhiteSpace}					{				             					}
{LineTerminator}			{				             					}
<<EOF>>			    			{return (token = ENDINPUT);	 	}
.			        				{return (token = error);	 		}
