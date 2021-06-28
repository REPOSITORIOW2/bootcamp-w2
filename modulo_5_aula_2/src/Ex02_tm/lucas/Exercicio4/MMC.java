package Exercicio4;

public class MMC {
    public static int calcular(int n1, int n2) {
        int resto = -1;
        int a = n1;
        int b = n2;

        do {
            resto = a % b;
            a = b;
            b = resto;
        } while (resto != 0);

        return (n1 * n2) / a;
    }
}
