package co.edu.eafit.dis.st0270.s20201.nano.abs;

import  co.edu.eafit.dis.st0270.s20201.nano.visitor.Visitor;

public abstract class AbsTree implements Element {
   public abstract void accept(Visitor visitor);
}
