import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {
    @Override
    public void sort(T[] arr, Comparator<T> c) {
        bubbleSort(arr, c);
    }

    void bubbleSort(T[] array, Comparator<T> c) {
        int n = array.length;
        while (n > 0) {
            int lastModifiedIndex = 0;
            for (int currentIndex = 1; currentIndex < n; currentIndex++) {
                if (c.compare(array[currentIndex - 1], array[currentIndex]) > 0) {
                    T temp = array[currentIndex - 1];

                    array[currentIndex - 1] = array[currentIndex];
                    array[currentIndex] = temp;

                    lastModifiedIndex = currentIndex;
                }
            }
            n = lastModifiedIndex;
        }
    }
}
