import exercises.*;

import java.util.Scanner;

public class ExercisesMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 - Numeros pares");
        System.out.println("2 - Numeros multiplos");
        System.out.println("3 - Numeros primos");
        System.out.println("4 - Quantidade de numeros primos");
        System.out.println("5 - Repeticao de digitos");
        System.out.println("6 - Ordenacao de array");
        System.out.println("7 - Crescimento da empresa");
        System.out.println("8 - Cadastro de produtos");
        System.out.println();
        System.out.print("Digite qual exercicio voce quer: ");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                exercises.Exercise1.exec();
                break;
            case 2:
                exercises.Exercise2.exec();
                break;
            case 3:
                exercises.Exercise3.exec();
                break;
            case 4:
                exercises.Exercise4.exec();
                break;
            case 5:
                exercises.Exercise5.exec();
                break;
            case 6:
                new exercises.Exercise6().exec();
                break;
            case 7:
                exercises.Exercise7.exec();
                break;
            case 8:
                exercises.Exercise8.exec();
                break;
            default:
                System.out.println("Opcao nao encontrada");
        }
    }
}
