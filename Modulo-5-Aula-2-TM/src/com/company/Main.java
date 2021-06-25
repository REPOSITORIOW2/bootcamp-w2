package com.company;

import com.classes.Disciplina;
import com.classes.Estudante;
import com.classes.Turma;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        Estudante estudante1 = new Estudante("vicente", 13, 12020, 1),
                    estudante2 = new Estudante("rodrigo", 12, 22020, 1);


        Disciplina disciplina1 = new Disciplina("Estrutura de dados em java", 200),
                    disciplina2 = new Disciplina("Administração com enfase em startup", 40);


        Turma turminha = new Turma(1, "A");

        turminha.vinculaDisciplina(disciplina1);
        turminha.vinculaDisciplina(disciplina2);

        turminha.vinculaEstudante(estudante1);
        turminha.vinculaEstudante(estudante2);

        System.out.println(turminha.toString());

    }
}
