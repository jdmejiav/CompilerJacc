package co.edu.eafit.dis.st0270.s20201.nano.grammar;
public class Asignacion extends Terminal{
  public Asignacion(int col, int lin) {
    super(col, lin);
    }

    public Asignacion() {
      super(-1,-1);
      }

    public boolean equals(Object obj) {
      boolean ret = false;
        if (obj instanceof Asignacion) {
          ret = true;
        }
      return ret;
    }

    public String toString() {
      String res = super.toString();
      return new String("::= "+ res);
    }


    public int hashCode() {
      return EnumGrammarSymbol.Asignacion.ordinal();
    }
}
