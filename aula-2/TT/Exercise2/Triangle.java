package Exercise2;

public class Triangle extends GeometricFigure {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return this.base * this.height / 2;
    }
}
