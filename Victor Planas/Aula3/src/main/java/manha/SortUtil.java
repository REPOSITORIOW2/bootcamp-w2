package manha;

public class SortUtil {

    public static <T> void sort(Precedente <T> v[]){
        for (int i = 0; i < v.length - 1; i++) {
            // Variavel utilizada para controlar se o vetor ja está ordenado.
            boolean estaOrdenado = true;
            // for utilizado para ordenar o vetor.
            for (int j = 0; j < v.length - 1 - i; j++) {
                /* Se o valor da posição atual do vetor for maior que o proximo valor,
                  então troca os valores de lugar no vetor. */
                Precedente<T> precedente = v[j+1];

                if (v[j].precedeA((T)precedente) == 1) {
                    Precedente<T> aux = v[j];
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
