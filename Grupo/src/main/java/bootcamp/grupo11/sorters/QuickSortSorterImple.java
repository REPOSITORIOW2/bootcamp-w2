package bootcamp.grupo11.sorters;

import bootcamp.grupo11.Sorter;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    public void sort(T[] array, Comparator<T> comparator) {
        quickSort(array, comparator, 0, array.length-1);
    }


    private void quickSort(T[] arr, Comparator<T> comparator, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(arr, comparator, begin, end);

            quickSort(arr, comparator, begin, partitionIndex - 1);
            quickSort(arr, comparator, partitionIndex + 1, end);
        }
    }

    private int partition(T[] arr, Comparator<T> comparator, int begin, int end) {
        T pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr[j], pivot) <= 0) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        T swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }
}