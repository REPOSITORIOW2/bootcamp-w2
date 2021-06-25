package aula3;

import java.util.Scanner;

public class Exercicio2 {
    /*
    Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e m valores que o usuário irá inserir via console.
    Lembre-se que um número a é divisível por b se a é divisível por b.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.println(m*i);
        }

        sc.close();
    }
}
