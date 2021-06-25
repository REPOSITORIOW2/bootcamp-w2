package aula3;

import java.util.Scanner;

public class Exercicio3 {
    /*
    Desenvolva um programa para informar se um um número n é primo ou não,
    sendo n um valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean isPrime = true;

        for(int i = 1; i <= n; i++) {
            if(i != 1 && i != n && (n % i == 0)) {
                isPrime = false;
            }
        }

        System.out.println("Is prime? " + isPrime);

        sc.close();
    }
}
