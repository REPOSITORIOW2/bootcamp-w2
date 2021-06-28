package dev.feldmann.bootcamp.aula2.tm.pdf1.exercise1;

import java.util.*;

public class Turma {

    private String serie;
    private String identificador;
    private Set<Estudante> estudantes = new HashSet<>();
    private HashSet<Disciplina> disciplinas = new HashSet<>();


    public Turma(String serie, String identificador) {
        this.serie = serie;
        this.identificador = identificador;
    }


    public void addEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }

    public void addDisciplina(Disciplina... disciplinas){
        this.disciplinas.addAll(Arrays.asList(disciplinas));
    }


}
