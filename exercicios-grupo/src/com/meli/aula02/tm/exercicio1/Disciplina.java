package com.meli.aula02.tm.exercicio1;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", cargaHoraria=" + cargaHoraria;
    }
}
