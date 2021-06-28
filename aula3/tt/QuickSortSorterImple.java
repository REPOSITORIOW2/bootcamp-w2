package poo.aula3.tt;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    private int separar(T[] vetor, int inicio, int fim, Comparator<T> c) {
        T pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (c.compare(vetor[i],pivo) <= 0)
                i++;
            else if (c.compare(pivo, vetor[f]) < 0)
                f--;
            else {
                T troca = vetor[i];
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

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        int inicio = 0;
        int fim = arr.length - 1;
        quickSort(arr, inicio, fim, c);

    }

    private void quickSort(T[] vetor, int inicio, int fim, Comparator<T> c) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim, c);
            quickSort(vetor, inicio, posicaoPivo - 1, c);
            quickSort(vetor, posicaoPivo + 1, fim, c);
        }
    }
}
