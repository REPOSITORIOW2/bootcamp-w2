package JavaAula1.Empresa;

public class Empresa {
    private String nome;
    private double valor;
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    private double crescimento;

    public Empresa(String nome, double valor, double crescimento) {
        this.nome = nome;
        this.valor = valor;
        this.crescimento = crescimento;
    }

    public void cresci() {
        valor = valor * crescimento;
    }

    public String crescimento(int ano) {
        return this.nome +  " - 01/01/" + String.valueOf(ano) + "Valor da Empresa: " + this.valor + "m"; 
    }
    
}
