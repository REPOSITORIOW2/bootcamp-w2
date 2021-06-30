package dev.feldmann.bootcamp.aula2.tm.pdf2.exercise1;

public class ContaCorrente {


    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this(contaCorrente.getSaldo());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double quantidade) {

        if (this.saldo < quantidade) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= quantidade;
    }

    public void devolver(double quantidade) {
        // O que devolução significa?

    }

    public void transferir(ContaCorrente destino, double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior que 0");
        }
        if (this.saldo < quantidade) {
            throw new IllegalArgumentException("Saldo insuficiente!");
        }
        this.saldo -= quantidade;
        destino.saldo += quantidade;

    }

    public void depositar(double quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade precisa ser maior que 0");
        }
        this.saldo += quantidade;
    }



}
