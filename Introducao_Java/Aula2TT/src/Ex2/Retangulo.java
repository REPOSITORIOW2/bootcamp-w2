package Ex2;

public class Retangulo extends GeometricFigure {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		double area = base * altura;
		
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area do retangulo: "+ this.area();
	}

}
