package br.com.meli.modulo5.dia3.TM;

import java.util.Comparator;

public interface Sorter<T> {

    public void sort(T[] arr, Comparator<T> c);

}
