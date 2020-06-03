package co.edu.eafit.dis.st0270.s20201.nano.visitor;

import co.edu.eafit.dis.st0270.s20201.nano.abs.CfglrAbs;
import co.edu.eafit.dis.st0270.s20201.nano.abs.ProgAbs;

public interface Visitor {
   void visit(ProgAbs element);
   void visit(CfglrAbs element);
}
