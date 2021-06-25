package JavaAula1;
import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {

        System.out.println("Digite o valor desejado:");
        Scanner obs = new Scanner(System.in);
        System.out.println("Multiplos:");

        
        int quantity = obs.nextInt();
        
        for(int i = 1; i <= quantity; i++){
            System.out.println(i*2);
        }

        obs.close();
    }

}