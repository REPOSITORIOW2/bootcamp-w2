package aula4.tt.ex2;

public class Program {
    public static void main(String[] args) {
        GeometricFigure circulo = new Circulo(4.5);
        GeometricFigure triangulo = new Triangulo(7.0, 2.25);
        GeometricFigure retangulo = new Retangulo(10.0, 5.38);

        GeometricFigure[] figuras = {circulo, triangulo, retangulo};

        double mediaArea = GeometricUtil.areaMedia(figuras);

        System.out.println("A média das áreas é de: " + String.format("%.2f", mediaArea));
    }
}
