package Escola;

import Escola.Disciplina;
import Escola.Estudante;

import java.util.List;

public class Turma {
    String serie;
    int codID;
    List<Disciplina> disciplinas;
    List<Estudante> estudantes;

    public void addAluno(Estudante e1){
        this.estudantes.add(e1);
    }

    public void addDisciplina(Disciplina d1){
        this.disciplinas.add(d1);
    }

    public static void main(String[] args) {
        Disciplina matematica = new Disciplina("Matemática");
        Disciplina portugues = new Disciplina("Portugues");
        Disciplina historia = new Disciplina("Historia");

        Estudante e1 = new Estudante("Luiz", 25, 123456, "9 ano");
        Estudante e2 = new Estudante("Carlos", 25, 123446, "8 ano");
        Estudante e3 = new Estudante("Giovana", 22, 123356, "7 ano");
        Estudante e4 = new Estudante("Victor", 23, 123476, "6 ano");

    }

}
