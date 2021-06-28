package geometric;

public class TestGeometricFigure {
    public static void main(String[] args) {
        Utilidade util = new Utilidade();

        GeometricFigure[] arr = {
                new Circulo(1),  //3.14
                new Retangulo(2, 2), //4
                new Triangulo(2, 1)  // 1
        };

        System.out.println(util.areaMedia(arr));

    }
}
