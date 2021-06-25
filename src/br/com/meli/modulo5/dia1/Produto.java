package br.com.meli.modulo5.dia1;

class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    Produto(String nome, double preco, int quantidade){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}