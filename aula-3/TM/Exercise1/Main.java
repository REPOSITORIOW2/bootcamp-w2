package Exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[] stringArray = { "André", "Lucas", "Bruno", "Gabriel", "Pierre" };
//        Integer[] integerArray = {0 , 6, 4, 2 , 8, 10};
//        Double[] doubleArray = {5., 9., 3., 1. , 7.};

        Comparator<Integer> integerComparator = Comparator.<Integer>naturalOrder();
//        Comparator<String> stringComparator = Comparator.<String>naturalOrder();
//        Comparator<Double> doubleComparator = Comparator.<Double>naturalOrder();

//        Sorter<Integer> sorterInteger = (Sorter) MyFactory.getInstance(SorterEnum.QUICK_SORT);
//
//        sorterInteger.sort(integerArray, integerComparator);
//        System.out.println(Arrays.toString(integerArray));
//
//        Sorter<String> sorterString = (Sorter) MyFactory.getInstance(SorterEnum.BUBBLE_SORT);
//
//        sorterString.sort(stringArray, stringComparator);
//        System.out.println(Arrays.toString(stringArray));
//
//        Sorter<Double> sorterDouble = (Sorter) MyFactory.getInstance(SorterEnum.HEAP_SORT);
//
//        sorterDouble.sort(doubleArray, doubleComparator);
//        System.out.println(Arrays.toString(doubleArray));

        final Integer totalElements = 10000;

        Integer array[] = new Integer[totalElements];

        for (Integer i = totalElements; i > 0; i--)
            array[i-1] = i;

        Time time = new Time();
        time.start();

        Sorter<Integer> sorterInteger = (Sorter) MyFactory.getInstance("sorter");
        sorterInteger.sort(array, integerComparator);

        time.stop();
        System.out.println(time.elapsedTime() + "ms");
    }
}
