package JavaAula2;

import JavaAula2.ensino.Fracao;

public class Q4 {
    public static void main(String[] args) {
        Fracao frac1 = new Fracao(5, 5);
        Fracao frac2 = new Fracao(10, 5);

        frac1.soma(frac2);

        System.out.println(frac1);
    }
}
