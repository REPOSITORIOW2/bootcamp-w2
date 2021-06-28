package src;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    @Override
    public void sort(T arr[], Comparator<T> c) {
        quickSort(arr, c, 0, arr.length - 1);
    }

    private void quickSort(T arr[], Comparator<T> c, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(arr, c, inicio, fim);
            quickSort(arr, c, inicio, posicaoPivo - 1);
            quickSort(arr, c, posicaoPivo + 1, fim);
        }
    }

    private int separar(T arr[], Comparator<T> c, int inicio, int fim) {
        T pivo = arr[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (c.compare(arr[i], pivo) <= 0) {
                i++;
            } else if (c.compare(pivo, arr[f]) < 0)
                f--;
            else {
                T troca = arr[i];
                arr[i] = arr[f];
                arr[f] = troca;
                i++;
                f--;
            }
        }
        arr[inicio] = arr[f];
        arr[f] = pivo;
        return f;
    }
}
