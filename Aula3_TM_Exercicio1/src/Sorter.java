import java.util.Comparator;

public interface Sorter<T> {
    abstract public void sort(T arr[], Comparator<T> c);
}
