package TM;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T> {

    private final int START_QUICKSORT = 0;

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        quickSort(arr, START_QUICKSORT, arr.length, c);
        // print to see the arr sorted
//        for (T el: arr) {
//            System.out.print(el + " ");
//        }
    }

    private void quickSort(T[] vetor, int inicio, int fim, Comparator<T> c) {
         if (inicio < fim) {
                int posicaoPivo = separar(vetor, inicio, fim, c);
                quickSort(vetor, inicio, posicaoPivo - 1, c);
                quickSort(vetor, posicaoPivo + 1, fim,  c);
         }
    }

   private int separar(T[] vetor, int inicio, int fim, Comparator<T> c) {
         T pivo = vetor[inicio];
         int i = inicio + 1, f = fim-1;
         while (i <= f) {
                if (c.compare(vetor[i], pivo) <= 0) // if (vetor[i] <= pivo)
                       i++;
                else if (c.compare(pivo, vetor[f]) < 0) // else if (pivo < vetor[f])
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
}
