package com.bootcamp.calcularareacasa.models;

public class Casa {
    private String endereco;
    private String nome;
    private Comodo[] comodos;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Comodo[] getComodos() {
        return comodos;
    }

    public void setComodos(Comodo[] comodos) {
        this.comodos = comodos;
    }
}
