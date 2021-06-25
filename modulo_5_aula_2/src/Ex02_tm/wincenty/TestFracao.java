package Ex02_tm.wincenty;

public class TestFracao {
    public static void main(String[] args) {
        Fracao fracao1 = new Fracao(3, 5);
        Fracao fracao2 = new Fracao(1, 2);

        fracao1.add(fracao2);
        System.out.println(fracao1);

        Fracao fracao3 = new Fracao(1, 2);
        fracao2.add(fracao3);
        System.out.println(fracao2);

        Fracao fracao4 = new Fracao(5, 8);
        fracao4.mul(4);
        System.out.println(fracao4);

        Fracao fracao5 = new Fracao(4, 10);
        Fracao fracao6 = new Fracao(5, 8);

        fracao5.add(5);
        System.out.println(fracao5);
    }
}
