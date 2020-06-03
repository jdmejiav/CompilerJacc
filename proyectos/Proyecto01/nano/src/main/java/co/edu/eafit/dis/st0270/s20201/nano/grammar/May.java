package co.edu.eafit.dis.st0270.s20201.nano.grammar;
public class May extends Terminal{
  public May(int col, int lin) {
    super(col, lin);
    }

    public May() {
      super(-1,-1);
      }

    public boolean equals(Object obj) {
      boolean ret = false;
        if (obj instanceof May) {
          ret = true;
        }
      return ret;
    }

    public String toString() {
      String res = super.toString();
      return new String("May "+ res);
    }


    public int hashCode() {
      return EnumGrammarSymbol.May.ordinal();
    }
}
