package manha;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Alberto", 34324442);
        Pessoa p2 = new Pessoa("Beberto", 1212);
        Pessoa p3 = new Pessoa("Ceberto", 515151);
        Pessoa[] vetor = {p1,p2,p3};
        System.out.println(Arrays.toString(vetor));
        SortUtil.sort(vetor);
        System.out.println(Arrays.toString(vetor));
        Celular c1 = new Celular(1313223, "Celzinho");
        Celular c2 = new Celular(1313223, "Beliznho");
        Celular c3 = new Celular(1313223, "Altinho");
        Celular[] celulares = {c1,c2,c3};
        System.out.println(Arrays.toString(celulares));
        SortUtil.sort(celulares);
        System.out.println(Arrays.toString(celulares));
    }
}
