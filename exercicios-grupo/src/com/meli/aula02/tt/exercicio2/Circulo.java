package com.meli.aula02.tt.exercicio2;

public class Circulo extends GeometricFigure{

    private final double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (raio * raio);
    }
}
