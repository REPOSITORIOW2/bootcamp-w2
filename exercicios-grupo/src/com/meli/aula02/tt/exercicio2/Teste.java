package com.meli.aula02.tt.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        GeometricFigure f1 = new Retangulo(5, 3);
        GeometricFigure f2 = new Triangulo(3, 4);
        GeometricFigure f3 = new Circulo(2);
        GeometricFigure f4 = new Retangulo(7, 8);
        GeometricFigure f5 = new Triangulo(5, 5);
        GeometricFigure f6 = new Circulo(5);
        GeometricFigure f7 = new Retangulo(1, 2);
        GeometricFigure f8 = new Triangulo(6, 2);

        List<GeometricFigure> lista = new ArrayList<>();
        lista.add(f1);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);
        lista.add(f5);
        lista.add(f6);
        lista.add(f7);
        lista.add(f8);

        System.out.println("Área média");
        Utilidade.areaMedia(lista).ifPresent(System.out::println);
    }


}
