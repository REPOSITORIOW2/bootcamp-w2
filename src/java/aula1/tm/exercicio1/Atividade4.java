package java.aula1.tm.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade4 {
    /*
    Desenvolva um programa para mostrar por console os primeiros n números primos, sendo um valor que o usuário irá inserir pelo console.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número a ser verificado:");
        long n = scanner.nextLong();

        var numerosPrimos = new ArrayList<>();

        for (long i = 3; i < n; i = i + 2) {
            if (IsPrimo(i)) {
                numerosPrimos.add(i);
            }
        }

        System.out.println(numerosPrimos);
    }

    static boolean IsPrimo(long n) {
        boolean primo = true;

        for (long i = 2; i < n && primo; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        return primo;
    }
}
