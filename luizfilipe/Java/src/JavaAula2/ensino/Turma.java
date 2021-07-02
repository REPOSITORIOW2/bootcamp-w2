package JavaAula2.ensino;
import java.util.ArrayList;

import JavaAula2.ensino.Disciplina;

public class Turma {

    public Turma() {
        this.alunos = new ArrayList<Estudante>();
        this.disciplinas = new ArrayList<Disciplina>();
    }

    private ArrayList<Estudante> alunos;
    private ArrayList<Disciplina> disciplinas;

    public void addEstudante(Estudante aluno) {
        alunos.add(aluno);
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    @Override
    public String toString() {
        return "Quantidade de alunos: " + alunos.size() + "\n Quantidade de Turmas: " + disciplinas.size();
    }
}
