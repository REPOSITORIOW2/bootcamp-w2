package exercises;

import static java.lang.System.*;
import java.util.Scanner;

public class Exercise5 {
    public static void exec() {
        Scanner scan = new Scanner(in);

        out.print("Digite a quantidade de numeros: ");
        int numberQnt = scan.nextInt();
        out.print("Digite a quantidade de digitos: ");
        int digitsQnt = scan.nextInt();
        out.print("Digite o digito: ");
        int digit = scan.nextInt();

        int num = 0, index = 0;

        while(index < numberQnt) {
            int digitsNumber = Integer.toString(num).length() - Integer.toString(num).replaceAll(Integer.toString(digit), "").length();

            if (digitsNumber == digitsQnt) {
                out.println(num);
                index++;
            }

            num++;
        }
    }
}
