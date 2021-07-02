package dev.feldmann.bootcamp.aula3.tm.pdf2.exercise1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Pessoa[] pessoas = {
                new Pessoa("Xeila", "123123123"),
                new Pessoa("Kleber","213123132"),
                new Pessoa("Ana","213123"),
                new Pessoa("Bruno","888865")
        };
        SortUtil.sort(pessoas);
        System.out.println(Arrays.toString(pessoas));
    }
}
