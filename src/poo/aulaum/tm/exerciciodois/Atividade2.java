package poo.aulaum.tm.exerciciodois;

public class Atividade2 {

    public static void main(String[] args) {

        double x = 1.13;
        double y = 18.4;
        int anoInicial = 2021;
        final double X_GROWTH = 1.48;
        final double Y_GROWTH = 0.32;

        while (x < y) {
            System.out.printf("Empresa X - 01/01/%s - Valor da empresa: %f \n", anoInicial, x);
            System.out.printf("Empresa Y - 01/01/%s - Valor da empresa: %f \n\n", anoInicial, y);
            anoInicial++;
            x += x * X_GROWTH;
            y += y * Y_GROWTH;
        }

        System.out.printf("Empresa X - 01/01/%s - Valor da empresa: %f \n", anoInicial, x);
        System.out.printf("Empresa Y - 01/01/%s - Valor da empresa: %f \n", anoInicial, y);
    }
}