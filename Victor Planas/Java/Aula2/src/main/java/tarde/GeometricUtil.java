package tarde;

public class GeometricUtil {
    public static double areaMedia(GeometricFigure arr[]){
        double soma =0;
        for (int i = 0; i < arr.length; i++) {
            soma += arr[i].area();
        }
        return soma/arr.length;
    }


}
