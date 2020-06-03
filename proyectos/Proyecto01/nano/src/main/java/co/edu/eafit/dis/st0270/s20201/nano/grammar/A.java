package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public class A extends NonTerminal {

    public boolean equals(Object obj) {
    	boolean ret = false;
    	if (obj instanceof A) {
    	    ret = true;
    	}
    	return ret;
    }

    public int hashCode() {
	return EnumGrammarSymbol.A.ordinal();
    }

    public String toString() {
	return "A";
    }
}
