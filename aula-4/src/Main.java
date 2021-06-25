import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Domain.Disciplina;
import Domain.Estudante;
import Domain.Turma;


public class Main {
    public static void main(String[] args) {
        List<Disciplina> disciplinas = new ArrayList<Disciplina>();
        Disciplina matematica = new Disciplina("matematica", 300);
        disciplinas.add(matematica);
        Disciplina portugues = new Disciplina("portugues", 450);
        disciplinas.add(portugues);
        Disciplina historia = new Disciplina("historia", 600);
        disciplinas.add(historia);
        Disciplina geografia = new Disciplina("geografia", 370);
        disciplinas.add(geografia);
        Disciplina arte = new Disciplina("arte", 250);
        disciplinas.add(arte);
        Disciplina fisica = new Disciplina("fisica", 150);
        disciplinas.add(fisica);
        
        List<Estudante> estudantes = new ArrayList<Estudante>();
        
        for(int i = 0; i < 5; i++){
            Estudante estudante = new Estudante("Estudante", new Random().nextInt(15), i);
            estudantes.add(estudante);
        }

        Turma turma = new Turma(8, "C", disciplinas, estudantes);
        System.out.println(turma);
        
    }
}
