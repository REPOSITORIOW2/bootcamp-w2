package poo.aula3.tt;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {

    void bubbleSort(T[] arr, Comparator<T> c) {
        int n = arr.length;
        T temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (c.compare(arr[j - 1], arr[j]) > 0) {
                    //swap elements
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        bubbleSort(arr, c);
    }
}