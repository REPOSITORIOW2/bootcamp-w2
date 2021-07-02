package JavaAula2.contas;

import javax.management.RuntimeErrorException;

public class ContaCorrente {

    public ContaCorrente(String conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente tmpConta) {
        this.conta = tmpConta.getConta();
        this.saldo = tmpConta.getSaldo();
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    String conta;
    double saldo;

    public void deposito(double valor) {
        saldo = saldo + valor;
    }

    public void saque(double valor) {
        if (valor < saldo) {
            saldo = saldo - valor;
        } else{
            throw new RuntimeException("Saldo insuficiente para saque");
        }
    }

    public static void transferencia(ContaCorrente conta1, ContaCorrente conta2, double valor) {
        if(valor < conta1.getSaldo()){
            conta1.setSaldo(conta1.getSaldo() - valor);
            conta2.setSaldo(conta2.getSaldo() + valor);
        } else {
            throw new RuntimeException("Saldo insuficiente para transferencia");
        }
    }

    public void extrato() {
        System.out.println(this.conta);
        System.out.println(this.saldo);
    }
}
