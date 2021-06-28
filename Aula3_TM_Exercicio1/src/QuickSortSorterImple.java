import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quicksort(arr, 0, arr.length - 1, c);
    }

    private void quicksort(T[] array, int startIndex, int endIndex, Comparator<T> c)
    {
        if (startIndex < endIndex)
        {
            int pivotIndex = partition(array, startIndex, endIndex, c);
            quicksort(array, startIndex, pivotIndex, c);
            quicksort(array, pivotIndex + 1, endIndex, c);
        }
    }

    private int partition(T[] array, int startIndex, int endIndex, Comparator<T> c)
    {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true)
        {
            do startIndex++; while (c.compare(array[startIndex], pivotValue) < 0) ;

            do endIndex--; while (c.compare(array[endIndex], pivotValue) > 0) ;

            if (startIndex >= endIndex) return endIndex;

            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
