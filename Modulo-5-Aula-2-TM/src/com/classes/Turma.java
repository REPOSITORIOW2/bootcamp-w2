package com.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class Turma {

    private int serie;
    private String docIdentificador;

    ArrayList<Disciplina> disciplinas = null;
    ArrayList<Estudante> estudantes = null;

    public Turma(int serie, String docIdentificador) {
        this.serie = serie;
        this.docIdentificador = docIdentificador;

        disciplinas = new ArrayList<Disciplina>();
        estudantes = new ArrayList<Estudante>();
    }

    public void vinculaDisciplina(Disciplina _disciplina){

        disciplinas.add(_disciplina);

    }

    public void vinculaEstudante(Estudante _estudante){

        estudantes.add(_estudante);

    }

    public String disciplinaToString(ArrayList<Disciplina> list){

        String retorno = "";

        for (Disciplina elemento:
                list) {
            retorno += " " + "["+elemento.getNome()+","+elemento.getCargaHoraria()+"]";
        }

        return retorno;

    }

    public String estudanteToString(ArrayList<Estudante> list){

        String retorno = "";

        for (Estudante elemento:
                list) {
            retorno += " " + "["+elemento.getNome()+","+elemento.getIdade()+","+elemento.getMatricula()+","+elemento.getSerie()+"]";
        }

        return retorno;

    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie=" + serie +
                ", docIdentificador='" + docIdentificador + '\'' +
                ", disciplinas=" + this.disciplinaToString(disciplinas) +
                ", estudantes=" + this.estudanteToString(estudantes) +
                '}';
    }
}
