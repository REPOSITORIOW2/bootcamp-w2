package Banco;

import java.math.BigDecimal;

public class ContaCorrente {
    private long numeroConta;
    private int agencia;
    private double saldo;

    ContaCorrente(){

    }
    ContaCorrente(long numeroConta, int agencia, double saldo){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    ContaCorrente(ContaCorrente c){
        this.numeroConta = c.getNumeroConta();
        this.agencia = c.getAgencia();
        this.saldo = c.getSaldo();
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor){
        this.saldo += valor;
    }
    public void saque(double valor){
        if(saldo - valor >= 0){
            this.saldo -= valor;
        }else{
            System.out.println("Não foi possível concluir a operaçao :(");
        }

    }
    public void devolucao(){
        System.out.println("Saldo: " + this.saldo);
    }
    public void transferencia(ContaCorrente destino, double valor){
        if(saldo - valor >= 0){
            this.saldo -= valor;
            destino.setSaldo(destino.getSaldo()+valor);
        }else{
            System.out.println("Não foi possível concluir a operaçao :(");
        }
    }
}
