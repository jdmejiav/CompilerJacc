package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public class B extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof B) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return EnumGrammarSymbol.B.ordinal();
    }

    public String toString() {
	return "B";
    }
}
