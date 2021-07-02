package br.com.meli.Aula9_Exercicio1.domain;

public class Ingrediente {
    private String nome;
    private int caloria;

    public Ingrediente(String nome, int caloria) {
        this.nome = nome;
        this.caloria = caloria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCaloria() {
        return caloria;
    }

    public void setCaloria(int caloria) {
        this.caloria = caloria;
    }

}
