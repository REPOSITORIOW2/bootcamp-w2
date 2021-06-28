package com.bootcamp.tm.exercicio1.sorter;

import java.util.Comparator;

public class HeapSortSorterImple implements Sorter {

    @Override
    public void sort(Object[] arr, Comparator c) {
        int tamanho = arr.length;
        int i = tamanho / 2, pai, filho;
        Object t;
        while (true){
            if (i > 0){
                i--;
                t = arr[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = arr[tamanho];
                arr[tamanho] = arr[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (c.compare(arr[filho + 1], arr[filho]) == 1)) {filho++;}
                if ((c.compare(arr[filho], t) == 1)){
                    arr[pai] = arr[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            arr[pai] = t;
        }
    }
}
