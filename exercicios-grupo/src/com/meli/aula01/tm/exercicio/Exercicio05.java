package com.meli.aula01.tm.exercicio;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int d = input.nextInt();

        int totalNaturais = 0;
        int i = (int) Math.pow(10, m - 1);

        while (totalNaturais != n) {
            String valor = String.valueOf(i);
            int countDigitos = 0;
            for (int j = 0; j < valor.length(); j++) {
                if (Character.getNumericValue(valor.charAt(j)) == d) {
                    countDigitos++;
                }
            }
            if (countDigitos >= m) {
                System.out.println(i);
                totalNaturais++;
            }
            i++;
        }
    }
}