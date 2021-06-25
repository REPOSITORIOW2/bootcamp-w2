public class MediaArea {
    public static double areaMedia (GeometricFigure arrayDeFiguras[]) {
        int tamanhoArray = arrayDeFiguras.length;
        double somatorio = 0;

        for (GeometricFigure figura : arrayDeFiguras) {
            somatorio += figura.area();
        }

        return somatorio / tamanhoArray;
    }
}
