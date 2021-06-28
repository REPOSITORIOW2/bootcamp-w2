package Ex2;

public class Principal {

	public static void main(String[] args) {
		Circulo circulo = new Circulo(4);
		System.out.println(circulo);
		
		Triangulo triangulo = new Triangulo(4,4);
		System.out.println(triangulo);
		
		
		Retangulo retangulo = new Retangulo(4,4);
		System.out.println(retangulo);
		
		
		GeometricFigure listaG[] = {circulo,triangulo,retangulo};
		
		double media = GeometricFigure.areaMedia(listaG);
		System.out.println("media: " + media);
	}

}
