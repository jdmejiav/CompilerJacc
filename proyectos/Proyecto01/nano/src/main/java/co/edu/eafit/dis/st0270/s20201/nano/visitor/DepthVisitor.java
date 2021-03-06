package co.edu.eafit.dis.st0270.s20201.nano.visitor;

import co.edu.eafit.dis.st0270.s20201.nano.abs.CfglrAbs;
import co.edu.eafit.dis.st0270.s20201.nano.abs.ProgAbs;


public class DepthVisitor implements Visitor {

   private int depth = 0;

   public DepthVisitor() {
   }

   public int getDepth() {
      return depth;
   }

   public void visit(ProgAbs element) {
      element.getSub().accept(this);
   }

   public void visit(CfglrAbs element) {

      if (element == null) {
         this.depth = 0;
      }
      else {
         int leftValue = 1;
         if (element.getLeft() != null) {
            element.getLeft().accept(this);
            leftValue += getDepth();
         }

         int rightValue = 0;
         if (element.getRight() != null) {
            element.getRight().accept(this);
            rightValue = getDepth();
         }

         this.depth = Math.max(leftValue,rightValue);
      }
   }
}
