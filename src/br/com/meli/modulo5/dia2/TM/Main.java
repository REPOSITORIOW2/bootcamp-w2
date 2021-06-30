package br.com.meli.modulo5.dia2.TM;

public class Main {

    public static void main(String[] args) {
	    Turma turma1 = new Turma("8a Serie","0001");
        Turma turma2 = new Turma("7a Serie","0002");
        Turma turma3 = new Turma("6a Serie","0003");

        Disciplina port = new Disciplina("Português","60");
        Disciplina mat = new Disciplina("Matemática", "60");
        Disciplina ing = new Disciplina("Inglês", "30");
        Disciplina cien = new Disciplina("Ciências", "30");
        Disciplina hist = new Disciplina("História", "30");

        Estudante est11 = new Estudante("Joao", 14, 11, "8a Serie");
        Estudante est12 = new Estudante("Pedro", 14, 12, "8a Serie");
        Estudante est13 = new Estudante("Carla", 14, 13, "8a Serie");
        Estudante est21 = new Estudante("Arthur", 13, 21, "7a Serie");
        Estudante est22 = new Estudante("Igor", 13, 22, "7a Serie");
        Estudante est23 = new Estudante("Caio", 13, 23, "7a Serie");
        Estudante est31 = new Estudante("Gabriela", 12, 31, "6a Serie");
        Estudante est32 = new Estudante("Mariana", 12, 32, "6a Serie");
        Estudante est33 = new Estudante("Antonio", 12, 33, "6a Serie");

        Disciplina[] disciplinasTurma1 = {port,mat,ing,cien,hist};
        Disciplina[] disciplinasTurma2 = {port,mat,ing,cien};
        Disciplina[] disciplinasTurma3 = {port,mat,ing};

        Estudante[] estTurma1 = {est11, est12, est13};
        Estudante[] estTurma2 = {est21, est22, est23};
        Estudante[] estTurma3= {est31, est32, est33};

        turma1.setDisciplinas(disciplinasTurma1);
        turma2.setDisciplinas(disciplinasTurma2);
        turma3.setDisciplinas(disciplinasTurma3);

        turma1.setEstudantes(estTurma1);
        turma2.setEstudantes(estTurma2);
        turma3.setEstudantes(estTurma3);

        System.out.println(turma1);
        System.out.println(turma2);
        System.out.println(turma3);

    }
}
