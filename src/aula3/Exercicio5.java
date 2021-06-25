package aula3;

import java.util.Scanner;

public class Exercicio5 {
    /*
    Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos de m dígitos de d,
    sendo n, m e d valores que o utilizador vai enviar pelo console.

    Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5 números naturais que
    tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.

    Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar recursos que ainda não estudamos.
    O desafio é pesquisar no Google como usar esses recursos e usá-los!
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        int number = Integer.parseInt(firstNaturalNumber(d, m));
        int numbersFound = 1;

        while(numbersFound <= n) {
            int frequency = digitFrequency(number, d);

            if(frequency >= m) {
                System.out.println(number);
                numbersFound++;
            }

            number++;
        }

        sc.close();
    }

    public static int digitFrequency(int number, int digit) {
        int c = 0;

        while (number > 0) {
            // check for equality
            if (number % 10 == digit)
                c++;
            // reduce the number
            number = number / 10;
        }

        return c;
    }

    public static String firstNaturalNumber(int digit, int times) {
        StringBuilder str = new StringBuilder();

        for(int i = 0; i < times; i++) {
            str.append(digit);
        }

        return str.toString();
    }
}
