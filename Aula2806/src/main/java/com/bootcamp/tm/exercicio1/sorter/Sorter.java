package com.bootcamp.tm.exercicio1.sorter;

import java.util.Comparator;

public interface Sorter<T> {

    void sort(T arr[], Comparator<T> c);
}
