package Ex02_tm.wincenty;

public class ContaCorrente {

/*
Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência.
A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da
qual copiará todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para cada
variável de instância da classe, desenvolvendo um método set e outro método get. Por exemplo: se a
classe tem uma variável double saldo, seus métodos de acesso serão: double getSaldo () e void setSaldo
(double s) Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.
 */


    private int agencia;
    private int conta;
    private double saldo;
    private final String saldoInsuficiente = "Saldo Insuficiente";

    public ContaCorrente() {
    }

    public ContaCorrente(int agencia, int conta, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente conta) {
        this.agencia = conta.agencia;
        this.conta = conta.conta;
        this.saldo = conta.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    private boolean hasSaldo(double valor) {
        return this.saldo >= valor;
    }

    public void saque(double valor) {
        if (hasSaldo(valor))
            this.saldo -= valor;
        else
            System.out.println(saldoInsuficiente);
    }


    public void devolucao(double valor) {
        if (hasSaldo(valor))
            this.saldo -= valor;
        else
            System.out.println(saldoInsuficiente);
    }

    public void tranferencia(ContaCorrente destino, double valor) {
        if (hasSaldo(valor)) {
            this.saldo -= valor;
            destino.deposito(valor);
        }
        else
            System.out.println(saldoInsuficiente);
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
