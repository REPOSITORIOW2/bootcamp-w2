package Ex2;

public class Triangulo extends GeometricFigure {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		double area = (base * altura)/2;
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area do triangulo: "+ this.area();
	}

}
