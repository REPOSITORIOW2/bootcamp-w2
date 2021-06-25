import java.util.ArrayList;
import java.util.List;

public class RadixSort {
    private static String[] addPaddingDigits(int[] arr) {
        int n = arr.length;
        int maxDigits = getMaxDigits(arr);
        String[] arrStr = new String[n];
        // adds padding to numbers represented as strings
        for (int i = 0; i < n; i++) {
            arrStr[i] = String.valueOf(arr[i]);
            int numberLength = arrStr[i].length();
            int zerosToAdd = maxDigits - numberLength;
            String zeros = "";
            for (int j = 0; j < zerosToAdd; j++)
                zeros += "0";
            arrStr[i] = zeros + arrStr[i];
        }

        return arrStr;
    }

    private static int getMaxDigits(int[] arr) {
        int n = arr.length;
        int maxDigits = 0;
        // Copy values to new array as String and get
        // the max number of digits
        for (int i = 0; i < n; i++) {
            String numberStr = String.valueOf(arr[i]);
            int numberLength = numberStr.length();
            if (numberLength > maxDigits)
                maxDigits = numberLength;
        }
        return maxDigits;
    }

    public static void radixSort(int[] arr) {
        int n = arr.length;
        String[] arrStr = addPaddingDigits(arr);;
        int maxDigits = getMaxDigits(arr);
        
        
        // Iterar para cada posicao dos digitos em arrStr
        for (int i = 0; i < maxDigits; i++) {
            // reset lists
            List<List<String>> listas = new ArrayList<List<String>>();
            for (int j = 0; j < 10; j++) {
                listas.add(new ArrayList<String>());
            }
            // get current index
            int index = maxDigits - i - 1;

            // add number strings to correspondent lists
            for (String s: arrStr) {
                int digit = Integer.parseInt(s.charAt(index) + "");
                listas.get(digit).add(s);
            }

            int j = 0;

            for (List<String> lista: listas) {
                for (String s: lista) {
                    arrStr[j++] = s;
                }
            }
        }

        for (int i = 0; i < arrStr.length; i++) {
            arr[i] = Integer.parseInt(arrStr[i]);
        }
    }

    public static void main(String[] args) {
        int iArr[] = {16233, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i: iArr) {
           System.out.println(i);
        }
    }
}
