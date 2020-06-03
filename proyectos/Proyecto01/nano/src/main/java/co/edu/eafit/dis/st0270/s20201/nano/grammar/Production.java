package co.edu.eafit.dis.st0270.s20201.nano.grammar;

public class Production {

    public static Production P1;
    public static Production P2;
    public static Production P3;
    public static Production P4;
    public static Production P5;
    public static Production P6;
    public static Production P7;
    public static Production P8;
    public static Production P9;
    public static Production P10;
    public static Production P11;

    static {
	GrammarSymbol[] rhsP1 = { new S0(), new EndOfString() };
	P1 = new Production(new S1(), rhsP1);
	GrammarSymbol[] rhsP2 = { new A() , new Asignacion() , new S() , new Coma(), new S0() };
	P2 = new Production(new S0(), rhsP2);
	GrammarSymbol[] rhsP3 = { new A() , new Asignacion() , new S() };
	P3 = new Production(new S0(), rhsP3);
  GrammarSymbol[] rhsP4 = { };
	P4 = new Production(new S0(), rhsP4);
  GrammarSymbol[] rhsP5 = { new C() , new Palito() , new S() };
	P5 = new Production(new S(), rhsP5);
  GrammarSymbol[] rhsP6 = { new C() };
	P6 = new Production(new S(), rhsP6);
  GrammarSymbol[] rhsP7 = { };
	P7 = new Production(new S(), rhsP7);
  GrammarSymbol[] rhsP8 = { new B() , new A() };
	P8 = new Production(new C(), rhsP8);
  GrammarSymbol[] rhsP9 = { new A() };
	P9 = new Production(new C(), rhsP9);
  GrammarSymbol[] rhsP10 = { new Min() };
	P10 = new Production(new B(), rhsP10);
  GrammarSymbol[] rhsP11 = { new May() };
	P11 = new Production(new A(), rhsP11);
    }

    private NonTerminal nt = null;
    private GrammarSymbol[] gss = null;

    public Production(NonTerminal nt, GrammarSymbol[] gss) {
	this.nt = nt;
	this.gss = gss;
    }

    public NonTerminal getLHS() {
	return nt;
    }

    public GrammarSymbol[] getRHS() {
	GrammarSymbol[] ret = new GrammarSymbol[gss.length];

	for (int i = gss.length - 1, j = 0; i >= 0; i--, j++) {
	    ret[j] = gss[i];
	}

	return ret;
    }
}
