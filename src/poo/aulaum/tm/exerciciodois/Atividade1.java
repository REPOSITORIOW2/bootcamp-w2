package poo.aulaum.tm.exerciciodois;

import java.util.Arrays;

public class Atividade1 {

    /*
    Dado um vetor de 10 posições, sendo respectivamente ocupado pelos valores
    52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.

    Imprima no console:

    a) Sua ordenação crescente.

    b) Sua ordenação decrescente.
     */

    public static void main(String[] args) {

        int[] vetor = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        Arrays.sort(vetor);

        for (int i = 0; i<10; i++){
            System.out.println(vetor[i]);
        }

        for (int i = vetor.length-1; i>=0; i--){
            System.out.println(vetor[i]);
        }

    }

}
