import java.util.Collection;
import java.util.Comparator;

import org.graalvm.compiler.asm.sparc.SPARCAssembler.CMOV;

public class QuickSortSorterImple implements Sorter<T> {

    @Override
    public void sort(T arr[], Comparator<T> c) {
        quickSort(arr, c);
    }

    private void quickSort(T arr[], Comparator<T> c, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(arr, c, inicio, fim);
            quickSort(arr, c, inicio, posicaoPivo - 1);
            quickSort(arr, c, posicaoPivo + 1, fim);
        }
    }
    private static int separar(T arr[], Comparator<T> c, int inicio, int fim) {
        T pivo = arr[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (arr[i] <= pivo){
                   i++;
                   Collection.sort(arr, c);
               }
               else if (pivo < arr[f])
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
