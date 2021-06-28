package bootcamp.grupo11.sorters;

import bootcamp.grupo11.Sorter;

import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T> {
    public void sort(T[] array, Comparator<T> comparator) {
        int n = array.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i, comparator);

        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0, comparator);
        }
    }

    void heapify(T[] arr, int n, int i, Comparator<T> comparator) {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && comparator.compare(arr[l], arr[largest]) > 0)
            largest = l;

        // If right child is larger than largest so far
        if (r < n && comparator.compare(arr[r], arr[largest]) > 0)
            largest = r;

        // If largest is not root
        if (largest != i) {
            T swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest, comparator);
        }
    }
}