package aula4.tt.ex2;

/*
O erro gerado ao extender GeometricFigure é por conta do "contrato" que temos com a classe pai.
No caso, a solução é sobrescrever o método da classe pai
 */
public class Circulo extends GeometricFigure{
    private Double raio;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 2 * Math.PI * Math.pow(this.raio, 2);
    }
}
