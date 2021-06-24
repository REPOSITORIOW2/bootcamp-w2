package poo.aulaum.tm.exercicioum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//exercicio 1 - verificacao de numeros pares
public class Atividade1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> listaDeNumeros = new ArrayList<>();
        for (int i = 0, counter = 0; counter < n; i++) {
            if (i % 2 == 0) {
                listaDeNumeros.add(i);
                counter++;
            }
        }

        System.out.println(listaDeNumeros);

    }
}
