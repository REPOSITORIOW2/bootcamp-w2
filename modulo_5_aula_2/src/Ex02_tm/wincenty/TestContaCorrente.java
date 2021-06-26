package Ex02_tm.wincenty;

public class TestContaCorrente {

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1, 200, 0.00);
        ContaCorrente c2 = new ContaCorrente(2, 400, 100.00);

        System.out.println("-----------Valor inicial");

        System.out.println(c1);
        System.out.println(c2);

        c1.deposito(500.00);
        c1.saque(100.00);
        c1.tranferencia(c2, 100.00);

        System.out.println("-----------Valor Final");

        System.out.println(c1);
        System.out.println(c2);

    }



}
