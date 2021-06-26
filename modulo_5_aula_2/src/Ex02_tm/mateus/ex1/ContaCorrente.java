package Ex02_tm.mateus.ex1;


public class ContaCorrente{
    private double saldo;
    private int agencia;
    private int numero;

    public ContaCorrente(double saldo, int agencia, int numero) {
        this.saldo = saldo;
        this.agencia = agencia;
        this.numero = numero;
    }

    public ContaCorrente(ContaCorrente conta){
        this.saldo = conta.getSaldo();
        this.agencia = conta.getAgencia();
        this.numero = conta.getNumero();
    }

    public ContaCorrente() {

    }

    public void tranferencia(ContaCorrente conta, double valor){
        if(saldo > valor &&  valor > 0) {
            this.setSaldo(this.getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
        }else{
            System.out.println("Operação negada");
        }
    }

    public void saque(double valor){
        if(saldo > valor &&  valor > 0){
            this.setSaldo(this.getSaldo() - valor);
        }else{
            System.out.println("Operação negada");
        }
    }

    public void deposito(double valor){
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }else{
            System.out.println("Valor do deposito precisa ser maior que zero");
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String toString(){
        return "agencia: " + this.agencia +
                "\nnumero: " + this.numero +
                "\nsaldo: " + this.saldo;
    }
}