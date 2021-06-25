package poo.aula2.tm.exercicio1.classmanagement;

import java.util.Arrays;

public class Turma {

    private int serie;
    private String codigoIdentificador;
    private Disciplina[] disciplinas;
    private Estudante[] estudantes;

    public Turma(int serie, String codigoIdentificador, Disciplina[] disciplinas, Estudante[] estudantes) {
        this.serie = serie;
        this.codigoIdentificador = codigoIdentificador;
        this.disciplinas = disciplinas;
        this.estudantes = estudantes;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public void setCodigoIdentificador(String codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
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

    @Override
    public String toString() {
        return "Turma{" +
                "serie=" + serie +
                ", codigoIdentificador='" + codigoIdentificador + '\'' +
                ", disciplinas=" + Arrays.toString(disciplinas) +
                ", estudantes=" + Arrays.toString(estudantes) +
                '}';
    }
}
