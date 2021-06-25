package com.meli.aula02.tm.exercicio1;

import java.util.Arrays;

public class Turma {
    private String serie;
    private String codigo;
    private Estudante estudantes[];
    private Disciplina disciplina[];

    public Turma(String serie, String codigo, Estudante[] estudantes, Disciplina[] disciplina) {
        this.serie = serie;
        this.codigo = codigo;
        this.estudantes = estudantes;
        this.disciplina = disciplina;
    }

    public String getSerie() {
        return serie;
    }

    public Disciplina[] getDisciplina() {
        return disciplina;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDisciplina(Disciplina[] disciplina) {
        this.disciplina = disciplina;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigo='" + codigo + '\'' +
                ", estudantes=" + Arrays.toString(estudantes) +
                ", disciplina=" + Arrays.toString(disciplina) +
                '}';
    }
}
