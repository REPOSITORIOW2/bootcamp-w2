package poo.aula2.tm.exercicio1.classmanagement;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Estudante e1 = new Estudante("Marcelo", "100900", "9", 25  );
        Estudante e2 = new Estudante("Nathan", "100100", "8", 25  );

        Disciplina d1 = new Disciplina("Matematica", 80);
        Disciplina d2 = new Disciplina("Física", 80);

        Estudante[] estudantes = new Estudante[2];
        estudantes[0] = e1;
        estudantes[1] = e2;

        Disciplina[] disciplinas = new Disciplina[2];
        disciplinas[0] = d1;
        disciplinas[1] = d2;

        Turma t1 = new Turma(9, "C", disciplinas, estudantes);

        System.out.println(t1);
    }
}
