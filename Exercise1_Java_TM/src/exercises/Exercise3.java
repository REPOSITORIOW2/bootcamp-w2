package exercises;

import static java.lang.System.*;
import java.util.Scanner;

public class Exercise3 {
    public static void exec() {
        Scanner scan = new Scanner(in);

        out.print("Digite o número: ");
        int number = scan.nextInt();
        boolean isPrime = true;

        for(int i = 2; i < number; i++) {
            if (number%i == 0) {
                isPrime = false;
                break;
            }
        }

        final String message = isPrime ? "O número é primo" : "O número nao é primo";
        out.println(message);
    }
}
