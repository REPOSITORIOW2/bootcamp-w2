package poo.aulaum.tm.exercicioum;

/*Desenvolva um programa para informar se um um número n é
primo ou não, sendo n um valor que o usuário irá inserir pelo console.
Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
*/

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o número a ser verificado:");
         long n = scanner.nextLong();
         boolean primo = true;

         for (int i = 2; i < n && primo; i++) {
             if (n % i == 0 ) {
                 primo = false;
             }
         }

        System.out.println(primo ? "O número digitado é primo!" : "O número digitado não é primo!");
    }
}
