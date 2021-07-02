package tarde;

public class MainGeometrico {
    public static void main(String[] args) {
        GeometricFigure g1 = new Circulo(2);
        GeometricFigure g2 = new Triangulo(2,4);
        GeometricFigure g3 = new Retangulo(2, 5);
        GeometricFigure arr[] = {g1,g2,g3};
        System.out.println("Area media: " + GeometricUtil.areaMedia(arr));
    }
}
