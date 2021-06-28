import java.util.Comparator;

public class HeapSortSorterImple implements Sorter<Integer> {

    private static int tam;
    private static Integer[] vetor;

    @Override
    public void sort(Integer[] array, Comparator<Integer> comparator) {
        heapsort(array);
    }

    public static void heapsort(Integer[] array) {
        vetor = array;
        tam = vetor.length - 1;

        constroiHeap();

        for (int i = tam; i > 0; i--) {
            troca(0, tam);
            tam -= 1;
            maxHeapifica(0);
        }
    }

    // Função que constrói o Max-Heap
    private static void constroiHeap() {
        int meio = (int) (tam/2);

        for (int i = meio - 1; i >= 0; i--) {
            maxHeapifica(i);
        }
    }

    private static void troca(int i, int j) {
        int aux;

        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }

    private static void maxHeapifica(int pai) {
        int maior = pai,
        esquerda = 2 * pai + 1,
        direita = 2 * pai + 2;

        if (esquerda <= tam && vetor[esquerda] > vetor[maior])
            maior = esquerda;

        if (direita <= tam && vetor[direita] > vetor[maior])
            maior = direita;

        if (maior != pai) {
            troca(pai, maior);
            maxHeapifica(maior);
        }
    }
}
