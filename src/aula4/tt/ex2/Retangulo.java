package aula4.tt.ex2;

/*
O erro gerado ao extender GeometricFigure é por conta do "contrato" que temos com a classe pai.
No caso, a solução é sobrescrever o método da classe pai
 */
public class Retangulo extends GeometricFigure{
    private Double a;
    private Double b;

    public Retangulo(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }
}
