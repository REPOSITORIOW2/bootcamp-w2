package radixsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {
    public static void radixSort(int iArr[]) {
        String sArr[] = new String[iArr.length];
        List<String> L0 = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        List<String> L8 = new ArrayList<String>();
        List<String> L9 = new ArrayList<String>();
        List<List<String>> listas = new ArrayList<>(Arrays.asList(L0, L1, L2, L3, L4, L5, L6, L7, L8, L9));

        int maxSize = iArr[0];
        for(int i=0; i<iArr.length; i++) {
            if (iArr[i] > maxSize){
                maxSize = iArr[i];
            }
        }
        int maxDigits =  (String.valueOf(maxSize)).length();

        for(int i=0; i<iArr.length; i++) {
            sArr[i] = adicionarZeros(maxDigits, String.valueOf(iArr[i]));
        }

        for (int i = maxDigits - 1; i >=0; i--) {
            for (String s : sArr) {
                listas.get(Character.getNumericValue(s.charAt(i))).add(s);
            }
            sArr = new String[iArr.length];
            int j = 0;
            for (List<String> lista: listas) {
                for (String nbr: lista) {
                    sArr[j] = nbr;
                    j++;
                }
                lista.clear();
            }
        }

        for (int i=0; i<sArr.length; i++) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
    }

    public static String adicionarZeros(int maxDigits, String num){
        int zeros = maxDigits - num.length();
        StringBuilder numBuilder = new StringBuilder(num);
        for(int i = 0; i < zeros; i++){
            numBuilder.insert(0, "0");
        }
        num = numBuilder.toString();
        return  num;

    }
    public static void main(String[] args) {
        int[] iArr = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        radixSort(iArr);
        for (int i : iArr) {
            System.out.println(i + " ");
        }

    }

}
