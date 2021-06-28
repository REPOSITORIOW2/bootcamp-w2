package src;

import java.util.Comparator;

public class TestSorting {
    public static void main(String[] args) {
        Integer[] nums = {1, 24, 432, 32, 546, 5};
        //QuickSortSorterImple qs = new QuickSortSorterImple();
        HeapSortSorterImple hs = new HeapSortSorterImple();
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) o1).compareTo((Integer) o2);
            }
        };

        //qs.sort(nums, comparator);
        hs.sort(nums, comparator);

        for (Integer num: nums) {
            System.out.println(num);
        }
    }
}
