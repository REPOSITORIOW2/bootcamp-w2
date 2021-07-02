package com.aula24.tm.parte2;

import java.util.Arrays;
import java.util.Comparator;

public class Exercicio1 {

    public static void main(String[] args) {
        Integer[] array = {52, 10, 85, 1324, 1, 13, 62, 30, 12, 127};

        Arrays.sort(array);

        System.out.println("Crescente: " + Arrays.toString(array));

        Arrays.sort(array, Comparator.reverseOrder());

        System.out.println("Decrescente: " + Arrays.toString(array));
    }

}
