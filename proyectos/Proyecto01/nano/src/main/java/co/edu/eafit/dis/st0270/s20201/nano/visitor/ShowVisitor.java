package co.edu.eafit.dis.st0270.s20201.nano.visitor;

import co.edu.eafit.dis.st0270.s20201.nano.abs.AbsTree;
import co.edu.eafit.dis.st0270.s20201.nano.abs.DyckAbs;
import co.edu.eafit.dis.st0270.s20201.nano.abs.ProgAbs;

public class ShowVisitor implements Visitor {

   private StringBuffer sb = null;
   private char charLeft = '(';
   private char charRight = ')';

   public ShowVisitor() {
   }

   public ShowVisitor(char charLeft, char charRight) {
      this.charLeft = charLeft;
      this.charRight = charRight;
   }

   public StringBuffer getSB() {
      return sb;
   }

   public void visit(ProgAbs p) {
      p.getSub().accept(this);
   }

   public void visit(DyckAbs da) {

      if (da == null) {
         sb = new StringBuffer();
      }
      else {
         StringBuffer sbLocal = new StringBuffer(""+charLeft);
         if (da.getLeft() != null) {
            da.getLeft().accept(this);
            sbLocal.append(getSB());

         }
         sbLocal.append(charRight);
         if (da.getRight() != null) {
            da.getRight().accept(this);
            sbLocal.append(getSB());
         }
         this.sb = sbLocal;
      }
   }
}
