package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public class S0 extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof S0) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return EnumGrammarSymbol.S0.ordinal();
    }

    public String toString() {
	return "S0";
    }
}
