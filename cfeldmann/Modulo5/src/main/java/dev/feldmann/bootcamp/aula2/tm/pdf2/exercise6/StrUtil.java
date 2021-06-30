package dev.feldmann.bootcamp.aula2.tm.pdf2.exercise6;

public class StrUtil {


    public static String rpad(String str, char charToPad, int amount) {
        return str + String.valueOf(charToPad).repeat(amount);
    }

    public static String ltrim(String str) {
        return str.stripLeading();
    }

    public static String rtrim(String str) {
        return str.stripTrailing();
    }

    public static String trim(String str) {
        return str.strip();
    }

    public static int indexOfN(String str, char c, int n) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        var s = "John|Paul|George|Ringo";
        int n = 2;
        char c = '|';
        System.out.println(indexOfN(s, c, n));
    }

}

