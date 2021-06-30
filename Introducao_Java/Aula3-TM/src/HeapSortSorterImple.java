import java.util.Comparator;

public class HeapSortSorterImple<T extends Comparable<? super T>> implements Sorter<T> {
    private void heapSort(T[] array)
    {
        int size = array.length;
        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i);

        for (int i = size - 1; i >= 0; i--)
        {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private void heapify(T[] array, int size, int i)
    {
        int max   = i; 
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && array[left].compareTo(array[max]) > 0)
            max = left;

        if (right < size && array[right].compareTo(array[max]) > 0)
            max = right;

        if (max != i)
        {
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            heapify(array, size, max);
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        heapSort(arr);
    }
    
}
