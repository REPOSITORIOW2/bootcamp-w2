package Banco;

public class StringUtil {

    public static String rpda(String s, char c, int n) {
        return s + Character.toString(c) + Character.toString(n);
    }

    public static String ltrim(String s) {
        int pos = 0;
        char espaco = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != espaco) {
                pos = i;
            }
        }
        return s.substring(pos);
    }

    @org.jetbrains.annotations.NotNull
    public static String rtrim(String s) {
        int pos = s.length() - 1;
        char espaco = ' ';
        for (int i = pos; i >= 0; i--) {
            if (s.charAt(i) != espaco) {
                pos = i;
            }
        }
        return s.substring(0,pos);
    }

    @org.jetbrains.annotations.NotNull
    public static String trim(String s){
        String nova = ltrim(s);
        return rtrim(nova);
    }

    public static int indexOfN (String s, char c, int n){
        int contador = 0;
        int erro = -1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) contador++;
            if(contador == n) return i;
        }
        return erro;
    }
}
