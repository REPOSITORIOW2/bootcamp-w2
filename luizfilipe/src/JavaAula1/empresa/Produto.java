package JavaAula1.empresa;

public class Produto {
    private String nome;
    private double preco;
    private double quantidade;
    private double total;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.total = quantidade * preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return nome + "\nR$" + preco + "\nQuantidade: " + quantidade;
    }
}
