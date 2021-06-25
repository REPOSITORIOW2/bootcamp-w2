import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GeometricFigure> geometricFigureList = new ArrayList<>();

        Triangulo triangulo = new Triangulo(5,2);
        geometricFigureList.add(triangulo);
        System.out.println(triangulo);

        Retangulo retangulo = new Retangulo(3,4);
        geometricFigureList.add(retangulo);
        System.out.println(retangulo);

        Circulo circulo = new Circulo(12);
        geometricFigureList.add(circulo);
        System.out.println(circulo);

        System.out.println("area media: " + GeometryUtil.areaMedia(geometricFigureList));
    }
}
