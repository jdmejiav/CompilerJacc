package co.edu.eafit.dis.st0270.s20201.nano.parser;

import co.edu.eafit.dis.st0270.s20201.nano.grammar.NonTerminal;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Terminal;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Production;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.GrammarSymbol;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.PilotState;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I0;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I1;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I2;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I3;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I4;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I5;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I6;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I7;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I8;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I9;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I10;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I11;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I12;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I13;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I14;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I15;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.I16;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.S0;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.S;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.A;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.B;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.C;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Asignacion;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Palito;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Coma;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.May;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.Min;
import co.edu.eafit.dis.st0270.s20201.nano.grammar.EndOfString;
import co.edu.eafit.dis.st0270.s20201.nano.lexer.CfglrLexer;
import co.edu.eafit.dis.st0270.s20201.nano.abs.CfglrAbs;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Stack;


public class CfglrParser {

    private CfglrLexer  dl = null;
    private Terminal   cc  = null;
    private static Map<PilotState,Map<GrammarSymbol,PilotState>> pilotMap;
    private static Map<PilotState,Map<Terminal,Production>> reductionMap;

    static {
	// I0
	pilotMap     = new HashMap<PilotState, Map<GrammarSymbol,PilotState>>();
	Map<GrammarSymbol,PilotState> nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new S0(), new I2());
	nextStateMap.put(new A(), new I3());
  nextStateMap.put(new May(), new I1());
	pilotMap.put(new I0(), nextStateMap);
	// I1
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I1(), nextStateMap);
	// I2
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new EndOfString(), new I4());
	pilotMap.put(new I2(), nextStateMap);
	// I3
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new Asignacion(), new I5());
	pilotMap.put(new I3(), nextStateMap);
	// I4
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I4(), nextStateMap);
	// I5
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new B(), new I10());
	nextStateMap.put(new A(), new I11());
  nextStateMap.put(new Min(), new I6());
  nextStateMap.put(new May(), new I7());
  nextStateMap.put(new C(), new I9());
  nextStateMap.put(new S(), new I8());
	pilotMap.put(new I5(), nextStateMap);
	// I6
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I6(), nextStateMap);
	// I7
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I7(), nextStateMap);
	// I8
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	nextStateMap.put(new Coma(), new I12());
	pilotMap.put(new I8(), nextStateMap);
	// I9
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new Palito(), new I13());
	pilotMap.put(new I9(), nextStateMap);
	// I10
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new A(), new I14());
  nextStateMap.put(new May(), new I4());
	pilotMap.put(new I10(), nextStateMap);
  // I11
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I11(), nextStateMap);
  // I12
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new May(), new I1());
  nextStateMap.put(new A(), new I3());
  nextStateMap.put(new S0(), new I15());
	pilotMap.put(new I12(), nextStateMap);
  // I13
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
  nextStateMap.put(new C(), new I9());
  nextStateMap.put(new S(), new I16());
  nextStateMap.put(new B(), new I10());
  nextStateMap.put(new A(), new I9());
  nextStateMap.put(new May(), new I7());
  nextStateMap.put(new Min(), new I6());
	pilotMap.put(new I13(), nextStateMap);
  // I14
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I14(), nextStateMap);
  // I15
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I15(), nextStateMap);
  // I16
	nextStateMap = new HashMap<GrammarSymbol, PilotState>();
	pilotMap.put(new I16(), nextStateMap);



	// Implementing the reduction map
	reductionMap = new HashMap<PilotState, Map<Terminal,Production>>();
	// I0
	Map<Terminal,Production> nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P4);
	reductionMap.put(new I0(), nextProductionMap);
	// I4
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P1);
	reductionMap.put(new I4(), nextProductionMap);
	// I1
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new Asignacion(), Production.P11);
	reductionMap.put(new I1(), nextProductionMap);
	// I5
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P7);
  nextProductionMap.put(new Coma(), Production.P7);
	reductionMap.put(new I5(), nextProductionMap);
	// I6
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new May(), Production.P10);
	reductionMap.put(new I6(), nextProductionMap);
	// I7
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P11);
  nextProductionMap.put(new Coma(), Production.P11);
  nextProductionMap.put(new Palito(), Production.P11);
	reductionMap.put(new I7(), nextProductionMap);
	// I9
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P6);
  nextProductionMap.put(new Coma(), Production.P6);
	reductionMap.put(new I9(), nextProductionMap);
  // I8
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P3);
	reductionMap.put(new I8(), nextProductionMap);
  // I11
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P9);
  nextProductionMap.put(new Coma(), Production.P9);
  nextProductionMap.put(new Palito(), Production.P9);
	reductionMap.put(new I11(), nextProductionMap);
  // I12
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P4);
	reductionMap.put(new I12(), nextProductionMap);
  // I13
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P7);
  nextProductionMap.put(new Coma(), Production.P7);
	reductionMap.put(new I13(), nextProductionMap);
  // I14
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P8);
  nextProductionMap.put(new Coma(), Production.P8);
  nextProductionMap.put(new Palito(), Production.P8);
	reductionMap.put(new I14(), nextProductionMap);
  // I15
	nextProductionMap = new HashMap<Terminal,Production>();
	nextProductionMap.put(new EndOfString(), Production.P2);
	reductionMap.put(new I15(), nextProductionMap);
  // I16
	nextProductionMap = new HashMap<Terminal,Production>();
  nextProductionMap.put(new EndOfString(), Production.P5);
  nextProductionMap.put(new Coma(), Production.P5);
	reductionMap.put(new I16(), nextProductionMap);
    }

    public CfglrParser(CfglrLexer dl) {
	this.dl = dl;
    }

    public CfglrAbs parser()
	throws CfglrParserException, IOException {

	Stack<GrammarSymbol> stack = new Stack<GrammarSymbol>();
	stack.push(new I0());

	cc = dl.getNextToken();

	GrammarSymbol gs = null;

	do {

	    gs = stack.peek();

	    if (gs instanceof PilotState) {
		// Busca primero si existe un movimiento de desplazamiento
		PilotState nps = null;
		try {

		    nps =  pilotMap.get(gs).get(cc);
		    if (nps != null) {
			stack.push(cc);
			stack.push(nps);
		    }
		    else {
			throw new NullPointerException();
		    }

		    cc = dl.getNextToken();

		} catch (NullPointerException npe) {

		    // Busca un movimiento de reducción
		    Production p = reductionMap.get(gs).get(cc);

		    if (p == null) {
			throw new CfglrParserException("No reduce option, no shift option");
		    }

		    NonTerminal nt = p.getLHS();
		    GrammarSymbol[] gss = p.getRHS();

		    // Analiza si los elementos esperados en la pila coinciden
		    for (int i = 0; i < gss.length; i++) {

			GrammarSymbol top = stack.pop();
			if (!(top instanceof PilotState)) {
			    throw new CfglrParserException("No reduce state " + top + "stack: " + stack);
			}
			else {
			    top = stack.pop();
			    if (!top.equals(gss[i])) {
				throw new CfglrParserException("Stack symbol " + top + " different from " + gss[i]);
			    }
			}
		    }

		    gs = stack.peek();
		    if (gs instanceof PilotState) {

			nps =  pilotMap.get(gs).get(nt);
			if (nps != null) {
			    stack.push(nt);
			    stack.push(nps);
			}
		    }
		}
	    }
	    else {

		throw new CfglrParserException("Internal Exception");
	    }
	    gs = stack.peek();
	} while (!((gs instanceof PilotState) && gs.equals(new I0()) && cc.equals(new EndOfString())));

	return null;
    }
}
