package JavaAula2;

import JavaAula2.ensino.Circulo;
import JavaAula2.ensino.GeometricFigure;
import JavaAula2.ensino.GeometricUtil;
import JavaAula2.ensino.Triangulo;

public class Q7 {
    public static void main(String[] args) {
        GeometricFigure [] arrG = {
            new Circulo(3),
            new Circulo(3),
            new Triangulo(10, 2),
            new Triangulo(10, 2),
        };

        System.out.println(GeometricUtil.areaMedia(arrG));
    }
}
