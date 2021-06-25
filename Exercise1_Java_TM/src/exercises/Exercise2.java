package exercises;

import static java.lang.System.*;
import java.util.Scanner;

public class Exercise2 {
    public static void exec() {
        Scanner scan = new Scanner(in);

        out.print("Digite o valor de n: ");
        int n = scan.nextInt();

        out.print("Digite o valor de m: ");
        int m = scan.nextInt();

        int number = 0;

        for(int i = 0; i < n;) {
            if (number%m == 0) {
                out.println(number);
                i++;
            }

            number++;
        }
    }
}
