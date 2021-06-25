import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Radixsort {

    public static void radixSort(int iArr[]) {
        String[] sArr = Arrays.toString(iArr).split("[\\[\\]]")[1].split(", ");

        int higherValue = 0;
        for(int i : iArr){
            if(i > higherValue) higherValue = i;
        }
        int width = Integer.toString(higherValue).length();
        for(int i = 0; i < sArr.length; i++) {
            sArr[i] = String.format("%0" + width + "d", iArr[i]);
        }

        List<String> listaOrdenada = new ArrayList<String>(Arrays.asList(sArr));

        for(int x = 1; x <= width; x++) {
            List<List<String>> listasL = new ArrayList<List<String>>();

            for (int i = 0; i < 10; i++) {
                listasL.add(new ArrayList<String>());

                for (String j : listaOrdenada) {
                    String actualDigit = j.charAt(width - x) + "";
                    if (Integer.parseInt(actualDigit) == i) {
                        listasL.get(i).add(j);
                    }
                }

            }

            listaOrdenada.clear();
            for (List<String> L : listasL) {
                for (String s : L) {
                    listaOrdenada.add(s);
                }
            }

        }

        for (String s : listaOrdenada) {
            int num = Integer.parseInt(s);
            iArr[listaOrdenada.indexOf(s)] = num;
        }

    }

    public static void main(String[] args) {
        int iArr[] = { 16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8 };
        radixSort(iArr);
        for(int i : iArr) {
            System.out.print(i + " ");
        }
    }
}
