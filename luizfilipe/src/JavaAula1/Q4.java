package JavaAula1;
import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {

        System.out.println("Digite o valor desejado:");
        Scanner obs = new Scanner(System.in);
        
        int quantity = obs.nextInt();
        int control = 0;
        int actual = 2;

        System.out.println("primos:");
        
        while (control != quantity) {
            boolean result = true;

            for(int i = 2; i < actual; i++){
                if (actual%i == 0) {
                    result = false;
                }
            }

            if (result) {
                System.out.println(actual);
                control++;
            }

            actual += 1;
        }

        obs.close();
    }

}