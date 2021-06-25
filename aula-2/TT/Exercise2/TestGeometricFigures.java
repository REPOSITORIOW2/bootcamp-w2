package Exercise2;

public class TestGeometricFigures {
    public static double meanArea(GeometricFigure arr[]) {
        double sum = 0.;
        for (GeometricFigure fig : arr) {
            sum += fig.area();
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        GeometricFigure[] arr = {
                new Circle(1),
                new Rectangle(2, 2),
                new Triangle(2, 1)
        };
        System.out.println(meanArea(arr));
    }
}
