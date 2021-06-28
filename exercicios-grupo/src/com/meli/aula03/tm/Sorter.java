package com.meli.aula03.tm;

import java.util.Comparator;

public interface Sorter<T> {
    void sort(T[] arr, Comparator<T> c);
}
