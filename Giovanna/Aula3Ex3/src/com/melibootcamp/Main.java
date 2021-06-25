package com.melibootcamp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    }
    public static void Exercicio2(){
        List<GeometricFigure> geometricFigure = new ArrayList<GeometricFigure>();
        Circulo circulo = new Circulo(2);
        Triangulo triangulo = new Triangulo(2,4);
        Retangulo retangulo = new Retangulo(2,2);
        geometricFigure.add(circulo);
        geometricFigure.add(retangulo);
        geometricFigure.add(triangulo);
        var result = UtilityClass.areaMedia(geometricFigure);
        System.out.println(result);

    }
}
