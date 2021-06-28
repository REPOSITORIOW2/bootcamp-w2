package TM;

import java.util.Arrays;
import java.util.Comparator;

public class TestSorter {
    public static void main(String[] args) {
//        Integer[] intArr = {10, 45, 3, 9, 1000};
//        String[] strArr = {"Pablo", "Wincenty", "Lucas", "Hugo", "Mateus"};

        Comparator<Integer> intComparator = Comparator.naturalOrder();
//        Comparator<String> stringComparator = Comparator.naturalOrder();
//
        Sorter<Integer> sortAlgorithm = (Sorter) MyFactory.getInstance();
//        Sorter<String> sortStringAlgorithm = (Sorter) MyFactory.getInstance();
//
//        sortAlgorithm.sort(intArr, intComparator);
//        sortStringAlgorithm.sort(strArr, stringComparator);

//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(strArr));

        Integer[] intArr2 = new Integer[5000];
        int contador = 0;
        for (int index=4999; index >= 0; index--){
            intArr2[contador] = index;
            contador += 1;
        }

        Time tempo = new Time();
        tempo.start();
        sortAlgorithm.sort(intArr2, intComparator);
        tempo.stop();
        System.out.println(tempo.elapsedTime());


    }
}
