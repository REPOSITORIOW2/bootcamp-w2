package Ex2;

public abstract class GeometricFigure {
	
	public abstract double area();
	
	public static double areaMedia (GeometricFigure arr []) {
		
		double soma =0;
		
		for (GeometricFigure g : arr) {
			soma += g.area();
		}
		
		return soma/arr.length;
	}
	
}
