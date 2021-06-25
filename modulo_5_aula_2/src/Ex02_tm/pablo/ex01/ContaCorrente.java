
public class ContaCorrente{
	/**
	 * Crie uma classe Conta Corrente, com os métodos: depósito, saque, devolução e transferência. 
	 * A classe conterá um construtor padrão, um com parâmetros e outro que receberá uma conta corrente da 
	 * qual copiará todos os seus dados. Além disso, os métodos de acesso devem ser desenvolvidos para cada 
	 * variável de instância da classe, desenvolvendo um método set e outro método get. Por exemplo: se a 
	 * classe tem uma variável double saldo, seus métodos de acesso serão: double getSaldo () e void setSaldo (double s)
	 *  Os protótipos dos métodos e construtores devem ser discutidos e projetados em equipe.
	 */

	 private String conta;
	 private String agencia;
	 private double saldo;
	 private String titular;


	public ContaCorrente() {

	}

	public ContaCorrente (ContaCorrente copyContaCorrente){
		this.conta = copyContaCorrente.getConta();
		this.agencia = copyContaCorrente.getAgencia();
		this.saldo = copyContaCorrente.getSaldo();
		this.titular = copyContaCorrente.getTitular();
	}

	public ContaCorrente (String conta, String agencia, double saldo, String titular){
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
		this.titular = titular;
	}

	 

	 public void deposito(double valorDeposito){
		if (valorDeposito > 0)
			this.saldo += valorDeposito;
		else
			System.out.println("Valor deposito inválido.");
	 }

	 public void saque(double valorSaque){
		if (valorSaque > 0 && valorSaque <= this.saldo){
			this.saldo -= valorSaque;
		}else{
			System.out.println("Saque inválido..");
		}
	 }

	 public void devolucao(double valorDevolucao){
		if(valorDevolucao>0){
			this.saldo += valorDevolucao;
		}else{
			System.out.println("Devolucao inválida..");
		}
	 }

	 public void transferencia(ContaCorrente target, double value){
		if (value > 0){
			target.setSaldo(saldo);
		}else{
			System.out.println("Transferencia inválida..");
		}
	 }


	 public String getConta(){
		 return this.conta;
	 }
	 public String getAgencia(){
		return this.agencia;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public String getTitular(){
		return this.titular;
	}

	public void setConta(String cc){
		this.conta = cc;
	}
	public void setAgencia(String ag){
		this.agencia = ag;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public void setTitular(String t){
		this.titular = t;
	}
}