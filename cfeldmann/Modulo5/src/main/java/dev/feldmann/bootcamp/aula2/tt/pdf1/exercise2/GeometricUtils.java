package dev.feldmann.bootcamp.aula2.tt.pdf1.exercise2;

public class GeometricUtils {


    public static double areaMedia(GeometricFigure[] figures) {
        if (figures.length == 0) return 0;
        double area = 0;
        for (GeometricFigure figure : figures) {
            area += figure.area();
        }
        return area / figures.length;
    }


}
