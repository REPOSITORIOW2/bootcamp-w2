package com.melibootcamp;

public class Book {
    private String nome;
    private String autor;
    private int anoDePublicacao;
    private int codigoLivro;

    public String getNome() {
        return nome;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }

    public void emprestimo(int numeroCarteirinha, int codigoLivro){
        //implementacao correta exige armazenamento de dados
    }
    public void devolucao(int numeroCarteirinha, int codigoLivro){
        //implementacao correta exige armazenamento de dados
    }

    public Book() {

    }

    public Book(String nome, String autor, int anoDePublicacao, int codigoLivro) {
        this.nome = nome;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.codigoLivro = codigoLivro;
    }
    @Override
    public String toString (){
        return "Informacoes do Livro: " + getNome() +
                " cod:"+getCodigoLivro()+
                "\n escrito por " + getAutor() +
                "\n publicado em "+ getAnoDePublicacao();
    }
}
