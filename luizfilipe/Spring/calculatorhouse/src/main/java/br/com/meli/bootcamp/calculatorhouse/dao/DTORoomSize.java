package br.com.meli.bootcamp.calculatorhouse.dao;

public class DTORoomSize {
    String nome;
    Double size;

    public DTORoomSize(String nome, Double size) {
        this.nome = nome;
        this.size = size;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }
}
