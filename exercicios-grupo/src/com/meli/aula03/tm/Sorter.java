package com.meli.aula03.tm;

import java.util.Comparator;

public interface Sorter<T> {
    public abstract void sort(T[] arr, Comparator<T> c);
}
