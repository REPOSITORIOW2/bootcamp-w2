package geometric;

public class Utilidade {

    public Utilidade() {
    }

    public static double areaMedia(GeometricFigure figuras[]){
        double area = 0.0;
        for (GeometricFigure figura : figuras) {
            area += figura.area();
        }
        return area / figuras.length;
    }
}
