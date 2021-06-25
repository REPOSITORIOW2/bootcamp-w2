package JavaAula1;
import java.util.Scanner;

public class Q3{
    public static void main(String[] args) {

        System.out.println("Digite o valor desejado:");
        Scanner obs = new Scanner(System.in);
        
        boolean result = true;
        
        int quantity = obs.nextInt();

        System.out.println("primo?");
        
        for(int i = 2; i < quantity; i++){
            if (quantity%i == 0) {
                result = false;
            }
        }

        System.out.println(result);

        obs.close();
    }

}