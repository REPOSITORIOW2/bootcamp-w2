public class Produto {
    private String nome;
    private double preco;
    private int qtd;
    Produto(String nome, double preco, int qtd){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtd() {
        return qtd;
    }

    public String getNome() {
        return nome;
    }
}
