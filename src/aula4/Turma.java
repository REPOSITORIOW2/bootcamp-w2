package aula4;

import java.util.Arrays;

public class Turma {
    private String serie;
    private Character codigoID;
    private Estudante[] estudantes;
    private Disciplina[] disciplinas;

    public Turma(String serie, Character codigoID, Estudante[] estudantes, Disciplina[] disciplinas) {
        this.serie = serie;
        this.codigoID = codigoID;
        this.estudantes = estudantes;
        this.disciplinas = disciplinas;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Character getCodigoID() {
        return codigoID;
    }

    public void setCodigoID(Character codigoID) {
        this.codigoID = codigoID;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Disciplina[] getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(Disciplina[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "serie='" + serie + '\'' +
                ", codigoID=" + codigoID +
                ", estudantes=" + Arrays.toString(estudantes) +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                '}';
    }
}
