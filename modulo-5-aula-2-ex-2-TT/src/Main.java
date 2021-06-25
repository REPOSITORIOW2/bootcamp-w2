public class Main {
    public static void main(String[] args) {
        GeometricFigure circulo = new Circulo(5);
        GeometricFigure triangulo = new Triangulo(10, 30);
        GeometricFigure retangulo = new Retangulo(5, 15);

        GeometricFigure[] arrayDeFiguras = {circulo, triangulo, retangulo};

        System.out.println(MediaArea.areaMedia(arrayDeFiguras));
    }
}
