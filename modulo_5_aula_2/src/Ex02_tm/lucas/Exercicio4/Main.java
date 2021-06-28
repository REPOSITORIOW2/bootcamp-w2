package Exercicio4;

public class Main {
    public static void main(String[] args) {
        Fracao fracao = new Fracao(4, 12);
        Fracao fracao2 = new Fracao(8, 3);
        fracao.dividir(fracao2);
        System.out.println(fracao);
    }
}
