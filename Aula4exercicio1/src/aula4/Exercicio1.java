package aula4;

import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {

    public static void main(String[] args) {

        Estudante estudante1 = new Estudante("Michel", 29, 1, 5);
        Estudante estudante2 = new Estudante("Artur", 31, 2, 9);
        Estudante estudante3 = new Estudante("Yan", 20, 3, 2);
        Estudante estudante4 = new Estudante("Rodrigo", 24, 4, 6);

        List<Estudante> lista1 = new ArrayList<>();
        lista1.add(estudante1);
        lista1.add(estudante2);
        lista1.add(estudante3);
        lista1.add(estudante4);


        List<Disciplina> disciplinas = new ArrayList<>();
        disciplinas.add(new Disciplina("Quimica", 4));
        disciplinas.add(new Disciplina("Fisica", 2));
        disciplinas.add(new Disciplina("Matematica", 3));
        disciplinas.add(new Disciplina("Portugues", 5));

        Turma turma1 = new Turma("9º ano C", 1, lista1, disciplinas);

        System.out.println(turma1.toString());

    }
}
