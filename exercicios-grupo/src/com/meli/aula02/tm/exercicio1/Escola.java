package com.meli.aula02.tm.exercicio1;

public class Escola {
    public static void main(String[] args) {
        Disciplina disciplina1 = new Disciplina("Matemática", 60);
        Estudante aluno1 = new Estudante("José", 14, "344", "9");
        Estudante estudantes[] = {aluno1};
        Disciplina disciplinas[] = {disciplina1};
        Turma turma1 = new Turma("9", "123", estudantes, disciplinas);

        System.out.println(turma1.toString());
    }
}
