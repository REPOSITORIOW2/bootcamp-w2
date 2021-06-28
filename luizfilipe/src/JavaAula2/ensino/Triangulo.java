package JavaAula2.ensino;

public class Triangulo extends GeometricFigure {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base*altura/2;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
