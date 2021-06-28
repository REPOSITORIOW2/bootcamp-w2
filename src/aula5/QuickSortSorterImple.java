package aula5;

import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T arr[], Comparator<T> c) {
        quickSort(arr, 0, arr.length - 1, c);
    }

    private void quickSort(T vetor[], int inicio, int fim, Comparator<T> c) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim, c);
            quickSort(vetor, inicio, posicaoPivo - 1, c);
            quickSort(vetor, posicaoPivo + 1, fim, c);
        }
    }

    private int separar(T vetor[], int inicio, int fim, Comparator<T> c) {
        T pivo = vetor[inicio];
        int i = inicio + 1, f = fim;

        while (i <= f) {
            if (c.compare(vetor[i], pivo) <= 0)
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

//    public static void main(String[] args) {
//        QuickSortSorterImple<Integer> qs = new QuickSortSorterImple<>();
//
//        Integer[] arr={90,23,101,45,65,23,67,89,34,23};
//
//        qs.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//
//        for(int i : arr) {
//            System.out.println(i);
//        }
//    }
}
