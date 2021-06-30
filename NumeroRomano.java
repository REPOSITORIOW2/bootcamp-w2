import java.util.HashMap;
import java.util.Map;

public class NumeroRomano {
  private String romano;
  private Map<String, Integer> romanoIntValues = new HashMap<String, Integer>();
  public NumeroRomano(String romano) {
    this.romano = romano;
    romanoIntValues.put("I", 1);
    romanoIntValues.put("V", 5);
    romanoIntValues.put("X", 10);
    romanoIntValues.put("L", 50);
    romanoIntValues.put("C", 100);
    romanoIntValues.put("D", 500);
    romanoIntValues.put("M", 1000);
    romanoIntValues.put("", 0);
  }

  public int toInt() {
    int num = 0;
    int n = this.romano.length();
    int i = n - 1;
    String previous = "";
    while (i >= 0) {
      String nextSymbol = String.valueOf(romano.charAt(i));
      int previousSymbolValue = romanoIntValues.get(previous);
      int nextSymbolValue = romanoIntValues.get(nextSymbol);
      if (previousSymbolValue > nextSymbolValue)
        num -= nextSymbolValue;
      else
        num += nextSymbolValue;
      previous = nextSymbol;
      i--;
    }
    return num;
  }

  @Override
  public String toString() {
    return this.romano + " (" + this.toInt() + ")";
  }

  public static void main(String[] args) {
    NumeroRomano r = new NumeroRomano("MCIII");
    System.out.println(r);
  }
}