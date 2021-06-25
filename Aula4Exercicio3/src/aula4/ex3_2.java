package aula4;

public class ex3_2 {

    public static void main(String[] args) {

        GeometricFigure[] figuras = new GeometricFigure[3];
        figuras[0] = new Circulo(5.0);
        figuras[1] = new Retangulo(3.0, 2.0);
        figuras[2] = new Triangulo(10.0, 8.0);
        System.out.printf("Area do circulo: %.2f\n Area do retangulo: %.2f\n Area do triangulo: %.2f\n\n",
                figuras[0].area(), figuras[1].area(), figuras[2].area());
        System.out.printf("Area media: %.2f\n", GeometricUtils.areaMedia(figuras));
    }

    public abstract static class GeometricFigure{

        public GeometricFigure() {
        }

        public abstract double area ();
    }

    public static class Circulo extends GeometricFigure{

        private Double raio;

        public Circulo(Double raio) {
            this.raio = raio;
        }

        @Override
        public double area() {
            return Math.PI * Math.pow(raio, 2);
        }
    }

    public static class Triangulo extends GeometricFigure{

        private Double base;
        private Double altura;

        public Triangulo(Double base, Double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double area(){
            return base * altura / 2;
        }
    }

    public static class Retangulo extends GeometricFigure{

        private Double base;
        private Double altura;

        public Retangulo(Double base, Double altura) {
            this.base = base;
            this.altura = altura;
        }

        @Override
        public double area(){
            return base * altura;
        }
    }

    public static class GeometricUtils{

        public static double areaMedia (GeometricFigure arr []){
            Double total = 0.0;
            for(GeometricFigure geometricFigure : arr){
                total += geometricFigure.area();
            }
            return total / arr.length;
        }
    }
}

