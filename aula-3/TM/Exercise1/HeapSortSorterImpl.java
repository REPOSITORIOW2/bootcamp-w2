package Exercise1;

import java.util.Comparator;

public class HeapSortSorterImpl<T> implements Sorter<T> {

    public void heapSort(T[] array, Comparator<T> c) {
        int n = array.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i, c);

        for (int i = n - 1; i > 0; i--) {
            T element = array[0];
            array[0] = array[i];
            array[i] = element;

            heapify(array, i, 0, c);
        }
    }

    void heapify(T[] array, int n, int i, Comparator<T> c) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && c.compare(array[l], array[largest]) > 0)
            largest = l;

        if (r < n && c.compare(array[r], array[largest]) > 0)
            largest = r;

        if (largest != i) {
            T swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest, c);
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        heapSort(arr, c);
    }
}
