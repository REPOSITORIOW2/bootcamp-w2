package com.bootcamp.calcularareacasa.models;

public class Aluno {
    private String nome;
    private Disciplina[] disciplinas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }
    public double calcularMedia(){
        var totalNotas = 0 ;
        for(int i= 0; i< disciplinas.length; i ++){
            totalNotas+= disciplinas[i].getNota();
        }
        return totalNotas/ disciplinas.length;
    }

}
