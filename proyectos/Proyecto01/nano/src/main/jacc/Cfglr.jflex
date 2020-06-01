
import java.io.IOException;
%%
%class CfglrLexer
%int
%line
%column
%public
%implements CfglrTokens
%{
    private int token;
    public int getToken(){
        return token;
    }
    public int getSemantic(){
        return token;
    }
    
    public int nextToken(){
        try{
            token=yylex();
        }
        catch(IOException ioe){
            System.err.println("Exception del analizador léxico"+ioe);
            System.exit(1);
        }
        return token;
    }
%}
LineTerminator=\r|\n|\r\n
WhiteSpace    ={LineTerminator}|[\t\n]
%%
"::="      {return (token=ASIG);}
","         {return (token=COMA);}
"|"         {return (token=PALITO);}
[A-Z]       {return (token=MAY);}
[a-z]       {return (token=MIN);}
{WhiteSpace}    {               }
<<EOF>>         {return (token=ENDINPUT);}
.               {return (token=error);  }
