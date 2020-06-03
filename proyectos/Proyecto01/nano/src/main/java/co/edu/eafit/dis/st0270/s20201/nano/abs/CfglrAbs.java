package co.edu.eafit.dis.st0270.s20201.nano.abs;

import  co.edu.eafit.dis.st0270.s20201.nano.visitor.Visitor;

public class CfglrAbs extends AbsTree {
   private AbsTree left = null;
   private AbsTree right = null;

   public CfglrAbs() {
      this.left = this.right = null;
   }

   public CfglrAbs(AbsTree left, AbsTree right) {
      this.left = left;
      this.right = right;
   }

   public AbsTree getLeft() {
      return this.left;
   }

   public AbsTree getRight() {
      return this.right;
   }

   public void accept(Visitor visitor) {
      visitor.visit(this);
   }
}
