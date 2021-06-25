package Ex02_tm.mateus.ex4;

//Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e dividir frações.
//Todos os métodos devem ser sobrecarregados para que também possam ser usados para operar entre frações e
//números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).


public class Main {
    public static void main(String[] args) {
        Fracao fracao = new Fracao(1, 2);
        Fracao fracao1 = new Fracao(1, 5);
        Fracao fracao2 = new Fracao(1, 10);
        Fracao fracao3 = new Fracao(5, 10);

        fracao.adicionar(fracao1);
        System.out.println(fracao);
        fracao1.subtrair(fracao2);
        System.out.println(fracao1);
        fracao2.multiplicar(fracao3);
        System.out.println(fracao2);
        fracao3.dividir(fracao1);
        System.out.println(fracao3);

        fracao.adicionar(1);
        System.out.println(fracao);
        fracao1.subtrair(1);
        System.out.println(fracao1);
        fracao2.multiplicar(2);
        System.out.println(fracao2);
        fracao3.dividir(2);
        System.out.println(fracao3);

    }
}
