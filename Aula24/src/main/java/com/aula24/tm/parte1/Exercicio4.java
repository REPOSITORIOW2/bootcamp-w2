package com.aula24.tm.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Desenvolva um programa para mostrar por console os primeiros n números primos,
 * sendo um valor que o usuário irá inserir pelo console.
 */
public class Exercicio4 {

    public static boolean ehPrimo(int numero) {
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira a quantidade de números primos para exibir: ");
        try {
            int numero = Integer.parseInt(scanner.next());

            List<Integer> numerosPrimos = new ArrayList<>();
            int i = 1;
            while(numerosPrimos.size() < numero) {
                if(ehPrimo(i)) {
                    numerosPrimos.add(i);
                }
                i++;
            }
            System.out.println("Numeros primos: " + numerosPrimos.toString());
        } catch(NumberFormatException exception) {
            System.out.println("Insira um número válido");
        }

        scanner.close();
    }

}
