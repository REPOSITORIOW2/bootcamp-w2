package com.bootcamp.tm.exercicio1.sorter;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter {
    @Override
    public void sort(Object[] arr, Comparator c) {
        quickSort(arr, 0, arr.length - 1, c);
    }

    private void quickSort(Object[] vetor, int inicio, int fim, Comparator c) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim, c);
            quickSort(vetor, inicio, posicaoPivo - 1, c);
            quickSort(vetor, posicaoPivo + 1, fim, c);
        }
    }

    private int separar(Object[] vetor, int inicio, int fim, Comparator c) {
        Object pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (c.compare(vetor[i], pivo) == -1)
                i++;
            else if (c.compare(vetor[f], pivo) == 1)
                f--;
            else {
                Object troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
