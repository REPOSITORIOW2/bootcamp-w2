package src;

import java.util.Comparator;

public class TestSorting {
    public static void main(String[] args) {
        Integer[] numbers = {2, 4, 1, 23, 0, 5, 9};
        QuickSortSorterImple qs = new QuickSortSorterImple();
        qs.sort(numbers, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        });
        for (Integer i : numbers)
            System.out.println(i);
    }
}
