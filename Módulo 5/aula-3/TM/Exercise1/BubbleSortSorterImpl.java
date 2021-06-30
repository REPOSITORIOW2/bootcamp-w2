package Exercise1;

import java.util.Comparator;

public class BubbleSortSorterImpl<T> implements Sorter<T> {

    private void bubbleSort(T[] array, Comparator<T> c) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (c.compare(array[i], array[j]) >= 0) {
                    T element = array[i];
                    array[i] = array[j];
                    array[j] = element;
                }
            }
        }
    }

    public void sort(T arr[], Comparator<T> c) {
        bubbleSort(arr, c);
    }
}
