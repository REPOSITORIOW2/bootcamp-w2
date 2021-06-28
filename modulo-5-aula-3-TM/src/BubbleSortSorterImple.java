import java.util.Comparator;

public class BubbleSortSorterImple<T> implements Sorter<T>{
    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        bubbleSort(array, comparator);
    }

    private void bubbleSort(T[] vetor, Comparator<T> comparator){
        boolean troca = true;
        T aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (comparator.compare(vetor[i], vetor[i + 1]) > 0) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
