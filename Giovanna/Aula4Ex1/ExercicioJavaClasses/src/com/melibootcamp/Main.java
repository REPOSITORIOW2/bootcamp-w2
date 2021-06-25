package com.melibootcamp;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	Estudante estudante = new Estudante("Joao",13,1234, 8);
	Estudante estudante2 = new Estudante("Maria",13,1235, 8);
	Estudante estudante3 = new Estudante("Pedro",11,1234, 6);

	Disciplina disciplina = new Disciplina("Matematica",150);
	Disciplina disciplina2 = new Disciplina("Portugues",150);
	Disciplina disciplina3 = new Disciplina("Ed fisica",100);
	Disciplina disciplina4 = new Disciplina("Quimica",150);
	Turma turma = new Turma(8, 'A',new ArrayList<Disciplina>(), new ArrayList<Estudante>());
	turma.adicionarDisciplina(disciplina);
	turma.adicionarDisciplina(disciplina2);
	turma.adicionarDisciplina(disciplina3);
	turma.adicionarDisciplina(disciplina4);
	turma.adicionarEstudante(estudante);
	turma.adicionarEstudante(estudante2);

	Turma turma2 = new Turma(6, 'A',new ArrayList<Disciplina>(), new ArrayList<Estudante>());
    turma2.adicionarDisciplina(disciplina);
    turma2.adicionarDisciplina(disciplina2);
    turma2.adicionarDisciplina(disciplina3);
    turma2.adicionarEstudante(estudante3);

    System.out.println(turma.toString());
    System.out.println(turma2.toString());
    }
}
