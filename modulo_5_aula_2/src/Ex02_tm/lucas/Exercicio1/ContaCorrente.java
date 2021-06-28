package Exercicio1;

public class ContaCorrente {
    private int agencia;
    private int conta;
    private String cpf;
    private double saldo;

    public ContaCorrente() {}

    public ContaCorrente(int agencia, int conta, String cpf, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCopia) {
        this.agencia = contaCopia.getAgencia();
        this.conta = contaCopia.getConta();
        this.cpf = contaCopia.getCpf();
        this.saldo = contaCopia.getSaldo();
    }

    public void depositar(double valor) {
        if (valor > 0 ) {
            this.saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Saque inválido");
        }
    }

    public void transferir(ContaCorrente contaDestino, double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.depositar(valor);
        } else {
            System.out.println("Transferência inválida");
        }
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", conta=" + conta +
                ", cpf='" + cpf + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
