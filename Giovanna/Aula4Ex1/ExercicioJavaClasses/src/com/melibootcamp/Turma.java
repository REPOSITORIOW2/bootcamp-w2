package com.melibootcamp;

import java.util.List;

public class Turma {
    private int serie;
    private char codigoIdentificador;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;

    public int getSerie() {
        return serie;
    }

    public char getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public void setCodigoIdentificador(char codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String retornarSerieECodigoIdentificador(){
        return getSerie()+"° ano "+ getCodigoIdentificador();
    }
    public void adicionarEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }
    public void adicionarDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return " Informacoes da Turma " +
                retornarSerieECodigoIdentificador() +
                retornarEstudantes() + retornarDisciplinas();

    }
    public String retornarEstudantes(){
        String nomesEstudantes = "\n Os estudantes da turma sao: ";
        for (Estudante estudante:estudantes) {
            nomesEstudantes+= estudante.getNome() +" - ";
        }
        return nomesEstudantes;
    }
    public String retornarDisciplinas(){
        String nomesDisciplinas = "\n As disciplinas da turma sao: ";
        for (Disciplina disciplina:disciplinas) {
            nomesDisciplinas+= disciplina.getNome() +" - ";
        }
        return nomesDisciplinas;
    }
    public Turma(){

    }
    public Turma(int serie, char codigoIdentificador, List<Disciplina> disciplinas, List<Estudante> estudantes){
        setCodigoIdentificador(codigoIdentificador);
        setSerie(serie);
        setDisciplinas(disciplinas);
        setEstudantes(estudantes);
    }
}
