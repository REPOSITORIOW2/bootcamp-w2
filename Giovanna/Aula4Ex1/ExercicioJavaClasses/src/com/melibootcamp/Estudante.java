package com.melibootcamp;

public class Estudante {
    private String nome;
    private int idade;
    private int numeroMatricula;
    private int serie;

    public int getIdade() {
        return idade;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public int getSerie() {
        return serie;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
     public Estudante(){

    }
    public Estudante(String nome, int idade, int numeroMatricula, int serie){
        setNome(nome);
        setIdade(idade);
        setSerie(serie);
        setNumeroMatricula(numeroMatricula);
    }
}
