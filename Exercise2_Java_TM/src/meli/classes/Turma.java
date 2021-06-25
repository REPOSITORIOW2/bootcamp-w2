package meli.classes;

import java.util.ArrayList;

public class Turma {
    private String serie;
    private String codigo;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Estudante> estudantes;

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public ArrayList<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(ArrayList<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public Turma(String serie, String codigo, ArrayList<Disciplina> disciplinas, ArrayList<Estudante> estudantes) {
        this.serie = serie;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }
}
