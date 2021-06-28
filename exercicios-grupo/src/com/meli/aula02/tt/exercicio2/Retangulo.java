package com.meli.aula02.tt.exercicio2;

public class Retangulo extends GeometricFigure{
    private double altura;
    private double base;

    public Retangulo(double altura, double base){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double area(){
        return altura*base;
    }
}
