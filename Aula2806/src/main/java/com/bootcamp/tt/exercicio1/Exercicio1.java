package com.bootcamp.tt.exercicio1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {
        List<Arma> armas = getArmas();
        List<Classe> classes = getClasses();

        armas.sort(null);
        classes.sort(null);

        System.out.println("Armas disponíveis: " + Arrays.toString(armas.toArray()));
        System.out.println("Classes disponíveis: " + Arrays.toString(classes.toArray()));

        System.out.println("  ");
        Personagem personagem = new Personagem("MELIante", classes.get(4), 1, armas.get(3));

        System.out.println(personagem.getUsername() + " ("+personagem.getClasse().getNome()+") irá atacar!");

        System.out.println("  ");

        System.out.println("--------------------------");
        for(int i = 0; i < armas.size(); i++) {
            personagem.setArma(armas.get(i));
            personagem.getArma().atirar();
        }
        System.out.println("--------------------------");
    }

    public static List<Arma> getArmas() {
        return Arrays.asList(new Arco("Arco", 5),
                new Espada("Espada", 7),
                new Faca("Faca", 4),
                new Teclado("Teclado", 4));
    }

    public static List<Classe> getClasses() {
        return Arrays.asList(new Classe("Guerreiro"),
                new Classe("Mago"),
                new Classe("Arqueiro"),
                new Classe("Necromancer"),
                new Classe("Programador"));
    }
}
