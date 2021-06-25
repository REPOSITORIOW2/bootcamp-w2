public class Circulo extends GeometricFigure{

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                " Area: " + this.area() +
                '}';
    }
}
