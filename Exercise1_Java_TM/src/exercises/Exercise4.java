package exercises;

import static java.lang.System.*;
import java.util.Scanner;

public class Exercise4 {
    public static void exec() {
        Scanner scan = new Scanner(in);

        out.print("Digite a quantidade de números: ");
        int qnt = scan.nextInt();
        int number = 2;

        for (int i = 0; i < qnt;) {
            boolean isPrime = true;

            for (int j = 2; j < number; j++) {
                if (number%j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                out.println("O numero é primo: " + number);
                i++;
            }

            number++;
        }
    }
}
