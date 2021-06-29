package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise2;

public class Triangle extends GeometricFigure {

    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                '}';
    }

    @Override
    public double area() {
        return (height * width) / 2;
    }
}
