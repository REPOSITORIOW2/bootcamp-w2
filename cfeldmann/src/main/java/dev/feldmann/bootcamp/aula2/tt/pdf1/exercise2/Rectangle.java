package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise2;

public class Rectangle extends GeometricFigure {

    private double width;
    private double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area() +
                '}';
    }

    @Override
    public double area() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
