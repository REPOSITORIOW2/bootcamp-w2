package com.aula24.tm.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
 * sendo n e m valores que o usuário irá inserir via console. Lembre-se que um número a é
 * divisível por b se a é divisível por b.
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira a quantidade de números múltiplos: ");
            int numerosMultiplos = Integer.parseInt(scanner.next());

            System.out.print("Insira o número base: ");
            int numeroBase = Integer.parseInt(scanner.next());

            List<Integer> numeros = new ArrayList<>();
            int i = 1;
            while(numeros.size() < numerosMultiplos){
                if(i % numeroBase == 0) {
                    numeros.add(i);
                }
                i++;
            }
            System.out.println("Numeros multiplos: " + numeros.toString());
        } catch(NumberFormatException exception) {
            System.out.println("Insira um número válido");
        }

        scanner.close();
    }

}
