package co.edu.eafit.dis.st0270.s20201.nano.grammar;
public class Palito extends Terminal{
  public Palito(int col, int lin) {
    super(col, lin);
    }

    public Palito() {
      super(-1,-1);
      }

    public boolean equals(Object obj) {
      boolean ret = false;
        if (obj instanceof Palito) {
          ret = true;
        }
      return ret;
    }

    public String toString() {
      String res = super.toString();
      return new String(") "+ res);
    }


    public int hashCode() {
      return EnumGrammarSymbol.Palito.ordinal();
    }
}
