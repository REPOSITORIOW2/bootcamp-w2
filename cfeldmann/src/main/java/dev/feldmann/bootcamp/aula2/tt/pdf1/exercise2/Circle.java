package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise2;

public class Circle extends GeometricFigure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                '}';
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
