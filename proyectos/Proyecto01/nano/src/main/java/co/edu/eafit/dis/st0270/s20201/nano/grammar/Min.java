package co.edu.eafit.dis.st0270.s20201.nano.grammar;
public class Min extends Terminal{
  public Min(int col, int lin) {
    super(col, lin);
    }

    public Min() {
      super(-1,-1);
      }

    public boolean equals(Object obj) {
      boolean ret = false;
        if (obj instanceof Min) {
          ret = true;
        }
      return ret;
    }

    public String toString() {
      String res = super.toString();
      return new String(") "+ res);
    }


    public int hashCode() {
      return EnumGrammarSymbol.Min.ordinal();
    }
}
