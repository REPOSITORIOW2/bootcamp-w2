package src;

import java.util.Comparator;

public class TestSorting {

    public static Integer[] generateArray(int n) {
        Integer[] arr = new Integer[n];
        int i = 0;
        while (i < n) {
            arr[i] = n - i;
            i++;
        }
        return arr;
    }

    public static void printElapsedTimeSeconds(long elapsedTime) {
        System.out.println(elapsedTime/100F + " segundos");
    }

    public static void main(String[] args) {
        int n = 5000;
        long start;
        long end;
        Integer[] arr = generateArray(n);
        Time time = new Time();
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        };

        // performance tests
        Sorter sorter = (Sorter) MyFactory.getInstance("");
        time.start();
        sorter.sort(arr, c);
        time.stop();
        printElapsedTimeSeconds(time.elapsedTime());
    }
}
