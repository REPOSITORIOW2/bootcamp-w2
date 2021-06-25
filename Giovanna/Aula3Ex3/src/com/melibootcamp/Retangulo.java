package com.melibootcamp;

public class Retangulo extends GeometricFigure {
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        setArea(altura *base);
        return getArea();
    }

    public Retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
        area();
    }
}
