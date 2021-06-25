package com.melibootcamp;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Disciplina(){

    }
    public Disciplina(String nome, int cargaHoraria){
        setNome(nome);
        setCargaHoraria(cargaHoraria);
    }
}
