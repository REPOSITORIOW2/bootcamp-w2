package geometric;

public class Triangulo extends GeometricFigure {
    private double base;
    private double altura;

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public double getBase(){
        return this.base;
    }

    @Override
    public double area(){
        return (base*altura)/2;
    }
}
