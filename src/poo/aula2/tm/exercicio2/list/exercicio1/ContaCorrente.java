package poo.aula2.tm.exercicio2.list.exercicio1;

import java.math.BigDecimal;
import java.math.MathContext;

public class ContaCorrente {

    private int agencia;
    private int numeroConta;
    private Cliente titular;
    private BigDecimal saldo = new BigDecimal("0.00");;

    public ContaCorrente() {
    }

    public ContaCorrente(ContaCorrente origem) {
        this.agencia = origem.getAgencia();
        this.numeroConta = origem.getNumeroConta();
        this.titular = origem.getTitular();
        this.saldo = origem.getSaldo();
    }

    public ContaCorrente(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    public void deposito(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public  void saque(BigDecimal valor) throws Exception {
        if (this.saldo.compareTo(valor) == -1) {
            throw new Exception("Saldo insuficiente na conta" +
                    this.getNumeroConta() + " - Agencia: " +
                    this.getAgencia());
        }
        this.saldo = this.saldo.subtract(valor);
    }

    public void devolucaoPara(BigDecimal valor, ContaCorrente destino) {
        this.transferencia(valor, destino);
    }

    public void transferencia(BigDecimal valor, ContaCorrente destino) {
        try {
            this.saque(valor);
            destino.deposito(valor);
        } catch (Exception e) {
            System.out.println("Não foi possível realizar a transferência, "+
                    "motivo: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "agencia=" + agencia +
                ", numeroConta=" + numeroConta +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
