package dev.feldmann.bootcamp.aula2.tm.pdf1.exercise1;

public class Main {

    public static void main(String[] args) {


        var matematica = new Disciplina("Matemática", 200);
        var quimica = new Disciplina("Química", 210);
        var portugues = new Disciplina("Português", 400);
        var fisica = new Disciplina("Física", 300);

        var nonoAnoA = new Turma("9", "A");
        nonoAnoA.addDisciplina(matematica, portugues);

        var oitavoAnoB = new Turma("8", "B");
        oitavoAnoB.addDisciplina(matematica, portugues, fisica, quimica);


        var pedro = new Estudante("Pedro", 12, 111441, "9");
        nonoAnoA.addEstudante(pedro);

        var ednaldo = new Estudante("Ednaldo", 10, 102800, "8");
        oitavoAnoB.addEstudante(ednaldo);



    }
}
