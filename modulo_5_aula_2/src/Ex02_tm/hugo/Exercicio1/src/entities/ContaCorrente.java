package entities;

import exception.DepositoException;
import exception.SaqueException;
import exception.TransferenciaException;

public class ContaCorrente {

    private double saldo;
    private String numeroConta;
    private String nomeTitular;

    public ContaCorrente() {
    }

    public ContaCorrente(double saldo, String numeroConta, String nomeTitular){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public ContaCorrente(ContaCorrente contaParametro){
        this.saldo = contaParametro.getSaldo();
        this.numeroConta = contaParametro.getNumeroConta();
        this.nomeTitular = contaParametro.getNomeTitular();
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void deposita(double valor) throws DepositoException {
        if (valor < 0){
            throw new DepositoException("O valor do depósito não pode ser negativo!");
        }
        this.saldo += valor;
    }

    public void saca(double valor) throws SaqueException{
        if (this.getSaldo() < valor || valor < 0){
            throw new SaqueException("Erro no saque!" +
                                    "\nSaldo atual: " + this.getSaldo());
        }
        this.saldo -= valor;
    }

    public void transferencia(ContaCorrente destino, double valor) throws TransferenciaException, DepositoException {
        if (valor < 0 || this.getSaldo() < valor){
            throw new TransferenciaException("Erro na transferência");
        }
        this.saldo -= valor;
        destino.deposita(valor);
    }

    @Override
    public String toString() {
        return  "\nNumero da Conta = " + numeroConta +
                "\nSaldo = " + saldo +
                "\nNome do Titular = " + nomeTitular + '\n'
                ;
    }
}
