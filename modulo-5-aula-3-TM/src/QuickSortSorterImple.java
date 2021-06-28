import java.util.Comparator;

public class QuickSortSorterImple<T> implements Sorter<T>{

    @Override
    public void sort(T[] array, Comparator<T> comparator) {
        quickSort(array, 0, array.length - 1, comparator);
    }


    private void quickSort(T[] vetor, int inicio, int fim, Comparator<T> comparator) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim, comparator);
            quickSort(vetor, inicio, posicaoPivo - 1, comparator);
            quickSort(vetor, posicaoPivo + 1, fim, comparator);
        }
    }

    private int separar(T[] vetor, int inicio, int fim, Comparator<T> comparator) {
        T pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (comparator.compare(vetor[i], pivo) <= 0)
                i++;
            else if (comparator.compare(pivo, vetor[f]) < 0)
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
