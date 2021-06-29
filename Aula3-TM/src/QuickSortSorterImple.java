import java.util.Comparator;

public class QuickSortSorterImple<T extends Comparable<? super T>> implements Sorter<T> {

    private void quickSort(T[] array, int startIndex, int endIndex)
    {
        if (startIndex < endIndex)
        {
            int pivotIndex = partition(array, startIndex, endIndex);
            quickSort(array, startIndex, pivotIndex);
            quickSort(array, pivotIndex + 1, endIndex);
        }
    }

    private int partition(T[] array, int startIndex, int endIndex)
    {
        int pivotIndex = (startIndex + endIndex) / 2;
        T pivotValue = array[pivotIndex];
        startIndex--;
        endIndex++;

        while (true)
        {
            do startIndex++; while (array[startIndex].compareTo(pivotValue) < 0) ;
            do endIndex--; while (array[endIndex].compareTo(pivotValue) > 0) ;

            if (startIndex >= endIndex) return endIndex;

            T temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, 0, arr.length - 1);
    }
    
}
