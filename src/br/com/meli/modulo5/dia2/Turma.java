package br.com.meli.modulo5.dia2;

import java.util.Arrays;

public class Turma {

    private String serie;

    private String codId;

    private Disciplina[] disciplinas;

    private Estudante[] estudantes;

    Turma(String serie, String codId) {
        this.serie = serie;
        this.codId = codId;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodId() {
        return codId;
    }

    public void setCodId(String codId) {
        this.codId = codId;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public String toString() {
        return String.format("Serie "+this.serie+" \nCodigo:"+this.codId+"\n"+ Arrays.toString(this.disciplinas)+ "\n"+ Arrays.toString(estudantes));
    }


}
