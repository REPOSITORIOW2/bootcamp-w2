package aula4.tt.ex2;

public class GeometricUtil {

    public static double areaMedia(GeometricFigure[] arr) {
        double media = 0.0;

        for(GeometricFigure g : arr) {
            media += g.area();
        }

        return media;
    }
}
