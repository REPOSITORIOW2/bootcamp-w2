package bootcamp.grupo11.sorters;

import bootcamp.grupo11.Sorter;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T> {


    public void sort(T[] v, Comparator<T> comparator) {

        for (int i = 0; i < v.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < v.length - 1 - i; j++) {
                /* Se o valor da posição atual do vetor for maior que o proximo valor,
                  então troca os valores de lugar no vetor. */
                if (comparator.compare(v[j], v[j + 1]) == 1) {
                    T aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    estaOrdenado = false;
                }
            }
            // Se o vetor está ordenado então para as iterações sobre ele.
            if (estaOrdenado) break;
        }
    }
}
