package TM;

import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        bubbleSort(arr, c);
    }

    public void bubbleSort(T[] vet, Comparator<T> c){
    	int tamanho = vet.length;
		for(int i = 0; i<(tamanho-1); i++){
			for(int j = 0; j<(tamanho-2); j++){
				if(c.compare(vet[j], vet[j + 1]) > 0){
					T aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
    }
}
