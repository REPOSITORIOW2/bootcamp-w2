package br.com.meli.modulo5.dia3.TM;

import java.util.Comparator;

public class HeapSortSorterImple implements Sorter{

    @Override
    public void sort(Object[] arr, Comparator c) {

        System.out.println("Heap");
        heapSort(arr,c);

    }

    public void heapSort(Object[] vetor, Comparator c){
        int tamanho = vetor.length;
        int i = tamanho / 2, pai, filho;
        Object t;
        while (true){
            if (i > 0){
                i--; t = vetor[i];
            }else{
                tamanho--;
                if (tamanho <= 0) {return;}
                t = vetor[tamanho];
                vetor[tamanho] = vetor[0];
            }
            pai = i;
            filho = ((i * 2) + 1);
            while (filho < tamanho){
                if ((filho + 1 < tamanho) && (c.compare(vetor[filho + 1], vetor[filho]) > 0)) {filho++;}
                if (c.compare(vetor[filho], t) > 0){
                    vetor[pai] = vetor[filho];
                    pai = filho;
                    filho = pai * 2 + 1;
                }else {break;}
            }
            vetor[pai] = t;
        }
    }

}
