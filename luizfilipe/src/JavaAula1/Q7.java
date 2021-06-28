package JavaAula1;
import java.util.Scanner;

import JavaAula1.empresa.Empresa;

public class Q7{
    public static void main(String[] args) {

        Empresa empresa1 = new Empresa("Empresa X", 1.13, 2.48);
        Empresa empresa2 = new Empresa("Empresa Y", 18.4, 1.32);
        
        int ano = 2021;

        System.out.println( empresa1.crescimento(ano));
        System.out.println( empresa2.crescimento(ano));
        System.out.println("-------------------------");


        while (empresa1.getValor() < empresa2.getValor()) {
            empresa1.cresci();
            empresa2.cresci();

            ano++;

            System.out.println( empresa1.crescimento(ano));
            System.out.println( empresa2.crescimento(ano));
            System.out.println("-------------------------");
        }
    }

}