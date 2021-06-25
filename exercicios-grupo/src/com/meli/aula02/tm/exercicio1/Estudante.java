package com.meli.aula02.tm.exercicio1;

public class Estudante {
    private String nome;
    private int idade;
    private String matricula;
    private String serie;

    public Estudante(String nome, int idade, String matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                ", serie='" + serie + '\'';
    }
}
