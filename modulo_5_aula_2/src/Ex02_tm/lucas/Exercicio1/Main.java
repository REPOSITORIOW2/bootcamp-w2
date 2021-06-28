package Exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente1 = new ContaCorrente(1433, 1444281, "222.222.222-22", 500.00);
        ContaCorrente contaCorrente2 = new ContaCorrente(1434, 1444282, "333.333.333-33", 400.00);

        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
        System.out.println("--------------------------");
        contaCorrente1.depositar(100.00);
        System.out.println(contaCorrente1);
        contaCorrente1.sacar(100.00);
        System.out.println(contaCorrente1);
        contaCorrente1.transferir(contaCorrente2, 100.0);
        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
    }
}
