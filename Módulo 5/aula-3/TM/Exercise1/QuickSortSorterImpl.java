package Exercise1;

import java.util.Comparator;

public class QuickSortSorterImpl<T> implements Sorter<T> {

    private int makePartition(T[] array, int begin, int end, Comparator<T> c) {
        T pivot = array[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (c.compare(array[j], pivot) <= 0) {
                i++;
                T element = array[i];
                array[i] = array[j];
                array[j] = element;
            }
        }

        T element = array[i + 1];
        array[i + 1] = array[end];
        array[end] = element;

        return i + 1;
    }

    private void quickSort(T[] array, int begin, int end, Comparator<T> c) {
        if (begin < end) {
            int partitionIndex = makePartition(array, begin, end, c);

            quickSort(array, begin, partitionIndex-1, c);
            quickSort(array, partitionIndex+1, end, c);
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, 0, arr.length-1, c);
    }

}
