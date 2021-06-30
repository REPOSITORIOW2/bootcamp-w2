package geometric;

public class Circulo extends GeometricFigure{
    private double raio;

    public Circulo(){

    }

    public Circulo(double raio){
        this.raio = raio;
    }

    public void setRaio(double raio){
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.raio, 2);

    }

    @Override
    public String toString() {
        return "Circulo de raio " + this.raio;
    }
}
