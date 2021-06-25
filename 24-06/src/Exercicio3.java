import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        //Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que o usuário irá inserir pelo console.
        //Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
        Scanner scanner = new Scanner(System.in);
        // Primeiro le o numero
        System.out.println("Insira o numero desejado");
        int n = Integer.parseInt(scanner.nextLine());
        //Valida se tem mais de dois divisores
        int aux = 1;
        boolean primo = true;
        for(int i = 2;i<n;i++){
            if(n%i==0){
                primo = false;
                break;
            }
        }
        //Decide se é primo ou nao
        if(primo){
            System.out.println(n+" é primo");
        } else{
            System.out.println(n+" não é primo");
        }
    }
}
