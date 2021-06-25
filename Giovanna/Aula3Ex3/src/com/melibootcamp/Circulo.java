package com.melibootcamp;

public class Circulo extends GeometricFigure {
    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        setArea(Math.PI * Math.pow(radius,2));
        return getArea();
    }

    public Circulo(double radius) {
        this.radius = radius;
        area();
    }
}
