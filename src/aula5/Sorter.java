package aula5;

import java.util.Comparator;

// passo 1
public interface Sorter<T> {
    public void sort(T arr[], Comparator<T> c);
}
