package co.edu.eafit.dis.st0270.s20201.nano.abs;

import  co.edu.eafit.dis.st0270.s20201.nano.visitor.Visitor;

public class ProgAbs extends AbsTree {
   private AbsTree sub;

   public ProgAbs(AbsTree sub) {
      this.sub = sub;
   }

   public AbsTree getSub() {
      return this.sub;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
