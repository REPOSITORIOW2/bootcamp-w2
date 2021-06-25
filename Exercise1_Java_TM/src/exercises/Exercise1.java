package exercises;

import static java.lang.System.*;
import java.util.Scanner;

public class Exercise1 {
    public static void exec() {
        Scanner scan = new Scanner(in);

        out.print("Digite a quantidade de números pares: ");
        int qnt = scan.nextInt();
        int number = 0;

        for(int i = 0; i < qnt;) {
            if (number%2 == 0) {
                out.println(number);
                i++;
            }

            number++;
        }
    }
}
