package src;

import java.util.Comparator;

public class TestSorting {

    public static Integer[] generateArray(int n) {
        Integer[] arr = new Integer[n];
        int i = 0;
        while (i < n) {
            arr[i] = (int) (Math.random() * n);
            i++;
        }
        return arr;
    }

    public static void elapsedTimeSeconds(long start, long end) {
        System.out.println((end - start)/100F + " segundos");
    }

    public static void main(String[] args) {
        int n = 10000;
        long start;
        long end;
        Integer[] arr = generateArray(n);
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        };

        // performance tests
        System.out.println("Quicksort com " + n + " elementos");
        QuickSortSorterImple qs = new QuickSortSorterImple();
        start = System.currentTimeMillis();
        qs.sort(arr, c);
        end = System.currentTimeMillis();
        elapsedTimeSeconds(start, end);

        System.out.println("Bubblesort com " + n + " elementos");

        arr = generateArray(n);

        Sorter s = new BubbleSortSorterImple();

        s.sort(arr,c);

        for (Integer i: arr) {
            System.out.println(i);
        }

    }
}
