import java.util.Comparator;

public class HeapSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T arr[], Comparator<T> c) {
        heapSort(arr, c);
    }

    void heapSort(T[] array, Comparator<T> c)
    {
        int size = array.length;

        for (int i = size / 2 - 1; i >= 0; i--)
            heapify(array, size, i, c);

        for (int i = size - 1; i >= 0; i--)
        {
            T temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0, c);
        }
    }

    void heapify(T[] array, int size, int i, Comparator<T> c)
    {
        int max   = i;
        int left  = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && c.compare(array[left], array[max]) > 0)
            max = left;

        if (right < size && c.compare(array[right], array[max]) > 0)
            max = right;

        if (max != i)
        {
            T temp = array[i];
            array[i] = array[max];
            array[max] = temp;

            heapify(array, size, max, c);
        }
    }

}
