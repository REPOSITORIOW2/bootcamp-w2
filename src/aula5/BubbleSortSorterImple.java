package aula5;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T arr[], Comparator<T> c) {
        bubbleSort(arr, c);
    }

    private void bubbleSort(T vetor[], Comparator<T> c){
        boolean troca = true;
        T aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (c.compare(vetor[i], vetor[i + 1]) > 0) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }

//        public static void main(String[] args) {
//        BubbleSortSorterImple<Integer> bs = new BubbleSortSorterImple<>();
//
//        Integer[] arr={90,23,101,45,65,23,67,89,34,23};
//
//        bs.sort(arr, new Comparator<Integer>() {
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
