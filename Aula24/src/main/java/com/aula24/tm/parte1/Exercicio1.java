package com.aula24.tm.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá
 * inserir pelo console. Lembre-se que um número é par quando divisível por 2.
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de números pares para exibir: ");
        try {
            int numero = Integer.parseInt(scanner.next());

            List<Integer> numerosPares = new ArrayList<>();
            for(int i = 0; i < numero * 2; i++) {
                if(i % 2 == 0) {
                    numerosPares.add(i);
                }
            }
            System.out.println("Numeros pares: " + numerosPares.toString());
        } catch(NumberFormatException exception) {
            System.out.println("Insira um número válido");
        }

        scanner.close();
    }

}
