package co.edu.eafit.dis.st0270.s20201.nano.abs;

import  co.edu.eafit.dis.st0270.s20201.nano.visitor.Visitor;

public class DyckAbs extends AbsTree {
   private AbsTree left = null;
   private AbsTree right = null;

   public DyckAbs() {
      this.left = this.right = null;
   }

   public DyckAbs(AbsTree left, AbsTree right) {
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
