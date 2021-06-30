import java.util.LinkedHashMap;
import java.util.Map;

public class Representacao {
  private String romano;
  private Integer inteiro;
  private Map<String, Integer> romanoIntValues = new LinkedHashMap<String, Integer>();

  public Representacao(String romano) {
    this.romano = romano;
    this.initializeHash();
  }
  
  public Representacao(Integer inteiro) {
    this.inteiro = inteiro;
    this.initializeHash();
  }
  
  private void initializeHash() {
    romanoIntValues.put("M", 1000);
    romanoIntValues.put("CM", 900);
    romanoIntValues.put("D", 500);
    romanoIntValues.put("CD", 400);
    romanoIntValues.put("C", 100);
    romanoIntValues.put("XC", 90);
    romanoIntValues.put("L", 50);
    romanoIntValues.put("XL", 40);
    romanoIntValues.put("X", 10);
    romanoIntValues.put("IX", 9);
    romanoIntValues.put("V", 5);
    romanoIntValues.put("IV", 4);
    romanoIntValues.put("I", 1);
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

  public String toRoman() {
    int number = this.inteiro;
    StringBuilder sb = new StringBuilder();
    while (number > 0) {
      for (String symbol : romanoIntValues.keySet()) {
        int symbolValue = romanoIntValues.get(symbol);
        if (number >= symbolValue) {
          System.out.println(number + " " + symbolValue + " " + symbol);
          number -= symbolValue;
          sb.append(symbol);
          break;
        }
      }
    }
    return sb.toString();
  }

  @Override
  public String toString() {
    return this.romano + " (" + this.toInt() + ")";
  }

  public static void main(String[] args) {
    Representacao r = new Representacao("LXXXVIII");
    System.out.println(r);
    Representacao s = new Representacao(88);
    System.out.println(s.toRoman());
  }
}