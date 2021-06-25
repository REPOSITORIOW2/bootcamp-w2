package com.classes;

public class Estudante {

    private String nome;
    private int idade;
    private int matricula;
    private int serie;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getSerie() {
        return serie;
    }

    public Estudante(String nome, int idade, int matricula, int serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }
}
