package com.meli.aula04.lc;

public class FogoArtificio {
    private String nome;
    private String barulho;

    public String getBarulho() {
        return barulho;
    }

    public void setBarulho(String barulho) {
        this.barulho = barulho;
    }

    public FogoArtificio(String nome, String barulho) {
        this.nome = nome;
        this.barulho = barulho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FogoArtificio{" +
                "nome='" + nome + '\'' +
                ", barulho='" + barulho + '\'' +
                '}';
    }
}
