package geometric;

public class Retangulo extends GeometricFigure {

    double base;
    double altura;

    public Retangulo() throws Exception{
        throw new Exception("Retangulo precisa ter base e altura");
    }

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return this.base * this.altura;
    }

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }
}
