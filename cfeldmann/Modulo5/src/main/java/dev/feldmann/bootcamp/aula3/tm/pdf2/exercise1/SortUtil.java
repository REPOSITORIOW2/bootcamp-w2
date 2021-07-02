package dev.feldmann.bootcamp.aula3.tm.pdf2.exercise1;

public class SortUtil {


    public static <T> void sort(Precedente<T>[] array) {
        int length = array.length;
        if (length <= 1) return;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                // Aqui eu sei que T é um Prescedente
                // Pois devido a logica de implementação Pessoa implements Precedente<Pessoa>
                // Caso Pessoa implementar outro tipo genérico vai jogar castexception
                if (array[j].precedeA((T) array[j + 1]) >= 1) {
                    // Swap
                    var aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }


    }

}
