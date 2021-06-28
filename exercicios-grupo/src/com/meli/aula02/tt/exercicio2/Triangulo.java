package com.meli.aula02.tt.exercicio2;

public class Triangulo extends GeometricFigure{

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }
}
