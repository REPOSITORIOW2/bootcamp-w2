package com.meli.aula01.tm.exercicio;
import java.util.Scanner;

public class Exercicio04 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            int j = 1;
            int countPrimos = 0;
            while (countPrimos != n) {
                int countDivisores = 0;
                for (int i = 1; i <= j; i++) {
                    if (j % i == 0) {
                        countDivisores = countDivisores + 1;
                    }
                }
                if (countDivisores <= 2) {
                    System.out.println(j);
                    countPrimos = countPrimos + 1;
                }
                j = j + 1;
            }
        }
}

