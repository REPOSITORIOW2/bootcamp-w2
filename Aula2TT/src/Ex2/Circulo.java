package Ex2;

public class Circulo extends GeometricFigure {

	private double R;
	
	public Circulo(double R) {
		this.R = R;
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(R, 2);
		
		return area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Area do circulo: "+ this.area();
	}

}
