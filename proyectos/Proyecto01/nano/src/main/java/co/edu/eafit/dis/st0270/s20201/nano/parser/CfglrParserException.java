package co.edu.eafit.dis.st0270.s20201.nano.parser;

import co.edu.eafit.dis.st0270.s20201.nano.grammar.GrammarSymbol;

public class CfglrParserException extends Exception {

    public static final long serialVersionUID = 4487924422002636L;

    public CfglrParserException(String cause, GrammarSymbol gs) {
	super(cause + " at " + gs);
    }

    public CfglrParserException(String cause) {
	super(cause);
    }

}
