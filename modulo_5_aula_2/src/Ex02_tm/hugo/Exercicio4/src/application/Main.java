/*
Crie uma classe Fracao com métodos necessários para adicionar, subtrair, multiplicar e
dividir frações. Todos os métodos devem ser sobrecarregados para que também possam
ser usados para operar entre frações e números inteiros (por exemplo: ⅗ + 2 ou ⅝ * 4).
 */
package application;

import entities.Fracao;

public class Main {
    public static void main(String[] args) {

        Fracao fracao1 = new Fracao(3, 5);
        Fracao fracao2 = new Fracao(1, 2);

        fracao1.adicionar(fracao2);
        System.out.println(fracao1);

        Fracao fracao3 = new Fracao(1, 2);
        fracao2.adicionar(fracao3);
        System.out.println(fracao2);

        Fracao fracao4 = new Fracao(5, 8);
        fracao4.multiplicar(4);
        System.out.println(fracao4);

    }
}
