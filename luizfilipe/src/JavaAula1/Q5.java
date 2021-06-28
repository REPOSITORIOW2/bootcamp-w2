package JavaAula1;
import java.util.Scanner;

public class Q5{
    public static void main(String[] args) {

        Scanner obs = new Scanner(System.in);
        
        System.out.println("Digite quantos valores desejados");
        int quantityOut = obs.nextInt();
        System.out.println("Digite quantos digitos");
        int quantityDigits = obs.nextInt();
        System.out.println("Digite qual o digito");
        String digit = obs.next();
        char charDigit = digit.charAt(0);

        int control = 0;
        int actual = 0;

        
        while (control != quantityOut) {
            
            String tmpStrActual = String.valueOf(actual);

            long count = tmpStrActual.chars().filter(ch -> ch == charDigit).count();

            if (count == quantityDigits) {
                control += 1;
                System.out.println(actual);
            }

            actual += 1;
        }

        obs.close();
    }

}