package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise2;

public abstract class GeometricFigure {

    public abstract double area();


    @Override
    public String toString() {
        return String.format("Área da figura: %.2f", this.area());
    }
}
