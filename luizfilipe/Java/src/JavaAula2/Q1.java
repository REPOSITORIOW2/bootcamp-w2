package JavaAula2;

import JavaAula2.ensino.Estudante;
import JavaAula2.ensino.Turma;
import JavaAula2.ensino.Disciplina;

public class Q1 {
    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("luiz", 1, 111111);
        Estudante estudante2 = new Estudante("luiz", 2, 222222);
        Estudante estudante3 = new Estudante("luiz", 3, 333333);

        Disciplina aula1 = new Disciplina("aula1", 20);
        Disciplina aula2 = new Disciplina("aula2", 30);

        Turma turma = new Turma();

        turma.addDisciplina(aula1);
        turma.addDisciplina(aula2);

        turma.addEstudante(estudante1);
        turma.addEstudante(estudante2);
        turma.addEstudante(estudante3);

        System.out.println(turma);
    }
}
