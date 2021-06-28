import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<Integer>{
    @Override
    public void sort(Integer[] array, Comparator<Integer> comparator) {
        bubbleSort(array);
    }

    private static void bubbleSort(Integer vetor[]){
        boolean troca = true;
        int aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
    }
}
