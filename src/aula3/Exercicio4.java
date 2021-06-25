package aula3;

import java.util.Scanner;

public class Exercicio4 {
    /*
    Desenvolva um programa para mostrar por console os primeiros n números primos,
    sendo um valor que o usuário irá inserir pelo console.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int primeNumber = 2;
        int primesFounded = 0;

        while(primesFounded < n) {
            int primeFlag = 1;

            for(int i = 2; i < primeNumber - 1; i++) {
                if(primeNumber % i == 0) {
                    primeFlag = 0;
                    break;
                }
            }

            if(primeFlag == 1) {
                System.out.println(primeNumber);
                primesFounded++;
            }

            primeNumber++;
        }

        sc.close();
    }
}
