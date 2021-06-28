package JavaAula2.ensino;

public class GeometricUtil {
    
    public static double areaMedia(GeometricFigure[] arr) {
        double count = 0;
        double sumArea = 0;
        for (GeometricFigure geometricFigure : arr) {
            sumArea += geometricFigure.area();
            count += 1;
        }

        return sumArea/count;
    }
}
