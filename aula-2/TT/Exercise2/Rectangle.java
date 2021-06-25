package Exercise2;

public class Rectangle extends GeometricFigure {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double area() {
        return this.height * this.width;
    }
}
