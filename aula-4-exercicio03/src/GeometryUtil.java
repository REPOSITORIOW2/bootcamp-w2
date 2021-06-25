import java.util.ArrayList;
import java.util.List;

public class GeometryUtil {

    public static double areaMedia(List<GeometricFigure> geometries){
        double totalArea = 0;
        for (GeometricFigure geom: geometries) {
            totalArea += geom.area();
        }

        return totalArea / geometries.size();
    }
}
