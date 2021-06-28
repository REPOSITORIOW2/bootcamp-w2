import java.util.Comparator;

public interface Sorter<T> {
    abstract void sort(T[] array, Comparator<T> comparator);
}
