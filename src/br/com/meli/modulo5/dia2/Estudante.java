package br.com.meli.modulo5.dia2;

public class Estudante {

    private String nome;

    private int idade;

    private int matricula;

    private String serie;

    Estudante(String nome, int idade, int matricula, String serie) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.serie = serie;
    }

    public String toString() {
        return "Estudante: "+ this.nome+" - Idade: "+ this.idade+ " - Matricula: "+ this.matricula+ " - Série "+ this.serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
