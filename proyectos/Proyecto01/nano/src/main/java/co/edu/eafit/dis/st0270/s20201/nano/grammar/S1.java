package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public class S1 extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof S1) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return EnumGrammarSymbol.S1.ordinal();
    }

    public String toString() {
	return "S1";
    }
}
