package tarde;

public class Circulo extends GeometricFigure{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return (raio*raio)*3.14;
    }
}
