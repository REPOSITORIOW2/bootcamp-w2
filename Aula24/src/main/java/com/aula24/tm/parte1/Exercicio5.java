package com.aula24.tm.parte1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Desenvolver um programa para exibição por console os n primeiros números naturais que
 * têm pelo menos de m dígitos de d, sendo n, m e d valores que o utilizador vai enviar pelo console.
 *
 * Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os
 * primeiros 5 números naturais que tenham pelo menos 2 dígitos 3 no console.
 * Neste caso, a saída será: 33, 133 , 233, 303, 313.
 */
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Insira o n: ");
            long n = Long.parseLong(scanner.next());

            System.out.print("Insira o m: ");
            long m = Long.parseLong(scanner.next());

            System.out.print("Insira o d: ");
            long d = Long.parseLong(scanner.next());

            List<Long> quantidadeNumeros = new ArrayList<>();
            long i = 0;
            long j = 0;
            while(j < m) {
                i *= 10;
                i += d;
                j++;
            }
            quantidadeNumeros.add(i);
            long k = 0;
            while(quantidadeNumeros.size() < n) {
                i = quantidadeNumeros.get(quantidadeNumeros.size() - 1) + 1 + k;
                if(isValid(i, m, d)) {
                    quantidadeNumeros.add(i);
                    k = 0;
                }
                k++;
            }
            System.out.println("Numeros: " + quantidadeNumeros.toString());
        } catch(NumberFormatException exception) {
            System.out.println("Insira um número válido");
        }

        scanner.close();
    }

    public static boolean isValid(long i, long m, long d) {
        long total = 0;
        while(i != 0) {
            long resto = i % 10;
            if(resto == d) {
                total++;
                if(total == m) {
                    return true;
                }
            }
            i= i/10;
        }
        return false;
    }

}
