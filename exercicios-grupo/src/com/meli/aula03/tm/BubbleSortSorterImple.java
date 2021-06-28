package com.meli.aula03.tm;

import java.util.Arrays;
import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<Integer> {

    @Override
    public void sort(Integer[] x, Comparator c) {
        int[] arr = Arrays.stream(x).mapToInt(Integer::intValue).toArray();
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }
}