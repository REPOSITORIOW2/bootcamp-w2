import meli.classes.Disciplina;
import meli.classes.Estudante;
import meli.classes.Turma;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.*;

public class Exercicio1TM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Samuel", 12, 1234));
        estudantes.add(new Estudante("Igor", 13, 1256));
        estudantes.add(new Estudante("Waschington", 12, 1235));
        estudantes.add(new Estudante("Marina", 12, 12376));
        estudantes.add(new Estudante("Jonathan", 11, 12367));

        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Matematica", 12));
        disciplinas.add(new Disciplina("Algoritmos", 48));

        Turma turma1 = new Turma("7F", "B", disciplinas, estudantes);

        for(Estudante es : turma1.getEstudantes()) {
            es.setTurma(turma1);
            out.println(es.toString());
        }

        out.println();

        for(Disciplina ds : turma1.getDisciplinas()) {
            out.println(ds.toString());
        }
    }
}
