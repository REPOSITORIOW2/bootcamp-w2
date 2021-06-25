package aula4;

import java.util.List;

public class Turma {

    private String codigo;
    private int turma;
    private List<Estudante> estudantes;
    private List<Disciplina> disciplinas;

    public Turma(String codigo, int turma, List<Estudante> estudantes, List<Disciplina> disciplinas) {
        this.codigo = codigo;
        this.turma = turma;
        this.estudantes = estudantes;
        this.disciplinas = disciplinas;
    }

    @Override
    public String toString() {
        return "Turma{" +
                "Codigo='" + codigo + '\'' +
                ", Turma=" + turma +
                ", Estudantes=" + estudantes +
                ", Disciplinas=" + disciplinas +
                '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
