package com.melibootcamp;

public class ContaCorrente {
    private String nomeCompleto;
    private int numeroDaConta;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        if (getSaldo()-valor>0) {
            this.saldo = -valor;
        }
    }
    public String devolucao(){
        return "Informacoes da conta - "+ this.getNumeroDaConta()
         + "\n do usuario " + this.getNomeCompleto() +
         "\n Saldo atual: R$: "+ this.getSaldo();
    }
    public void tranferencia(int numeroDaContaEnviando, int numeroDaContaRecebendo, double valor){
        //para implementar esse metodo corretamente seria necessario persistencia de dados
    }

    public ContaCorrente() {
    }

    public ContaCorrente(String nomeCompleto, int numeroDaConta, double saldo) {
        this.nomeCompleto = nomeCompleto;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public ContaCorrente(ContaCorrente contaCorrente) {
        this.nomeCompleto = contaCorrente.nomeCompleto;
        this.numeroDaConta = contaCorrente.numeroDaConta;
        this.saldo = contaCorrente.saldo;
    }
}
