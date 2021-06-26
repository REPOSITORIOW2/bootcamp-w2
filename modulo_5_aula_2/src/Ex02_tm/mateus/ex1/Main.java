package Ex02_tm.mateus.ex1;
//Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
//A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da qual copiará todos os seus dados.
//Além disso, os métodos de acesso devem ser desenvolvidos para cada variável de instância da classe,
//desenvolvendo um método set e outro método get. Por exemplo: se a classe tem uma variável double saldo,
//seus métodos de acesso serão: double getSaldo () e void setSaldo (double s) Os protótipos dos métodos e
//construtores devem ser discutidos e projetados em equipe.

public class Main {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaCorrente contaCorrente1 = new ContaCorrente(100.0, 1, 1);
        ContaCorrente contaCorrente2 = new ContaCorrente(500.0, 2, 2);
        ContaCorrente contaCorrente3 = new ContaCorrente(contaCorrente1);

        contaCorrente1.saque(50.0);
        contaCorrente2.deposito(500.0);
        contaCorrente2.tranferencia(contaCorrente1, 200);

        System.out.println(contaCorrente1);
        System.out.println(contaCorrente2);
        System.out.println(contaCorrente3);
    }
}