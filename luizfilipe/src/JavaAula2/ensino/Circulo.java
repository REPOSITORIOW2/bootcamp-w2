package JavaAula2.ensino;

public class Circulo extends GeometricFigure {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
       return Math.pow(raio, 2)*3.14;
    }

    @Override
    public String toString() {
        return super.toString() + area();
    }
    
}
