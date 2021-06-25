package dev.feldmann.bootcamp.aula2.tm.exercise1.part1;


public class Disciplina {

    private String nome;
    private int cargaHoraria;


    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
}
