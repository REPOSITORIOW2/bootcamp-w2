package JavaAula1;
import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {

        System.out.println("Digite o valor desejado:");
        Scanner obs = new Scanner(System.in);
        
        
        int quantity = obs.nextInt();
        
        System.out.println("Multiplos:");
        
        for(int i = 1; i <= quantity; i++){
            System.out.println(quantity*i);
        }

        obs.close();
    }

}