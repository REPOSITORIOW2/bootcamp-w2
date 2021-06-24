package poo.aulaum.tm.exercicioum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atividade2 {

    /*
    Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
    sendo n e m valores que o usuário irá inserir via console. Lembre-se que um número a é divisível por b
    se a é divisível por b.
     */

    public static void main(String[] args) {

        int n,m;
        var scanner = new Scanner(System.in);

        System.out.println("Digite o número n:");
        n = scanner.nextInt();
        System.out.println("Digite o número m:");
        m = scanner.nextInt();

        System.out.println(n+"\n"+m);

        int counter = 0;
        List<Integer> listaDeMultiplos = new ArrayList<>();

        for(int i = 0; counter < n; i++){
            if(i%m == 0){
                listaDeMultiplos.add(i);
                counter++;
            }
        }

        System.out.println(listaDeMultiplos);






    }

}