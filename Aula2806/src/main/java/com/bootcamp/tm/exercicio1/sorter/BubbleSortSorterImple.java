package com.bootcamp.tm.exercicio1.sorter;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter {
    @Override
    public void sort(Object[] arr, Comparator c) {
        Object aux = 0;
        int i = 0;

        for(i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length - 1; j++){
                if(c.compare(arr[j], arr[j + 1]) == 1){
                    aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }
    }
}
