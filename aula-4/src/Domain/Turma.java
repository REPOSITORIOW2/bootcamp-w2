package Domain;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int serie;
    private String id;
    private List<Disciplina> disciplinas;
    private List<Estudante> estudantes;

    public Turma(int serie, String id, List<Disciplina> disciplinas, List<Estudante> estudantes) {
        this.serie = serie;
        this.id = id;
        this.disciplinas = new ArrayList<>(disciplinas);
        this.estudantes = new ArrayList<>(estudantes);
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public void addEstudante(Estudante estudante){
        this.estudantes.add(estudante);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public int getSerie() {
        return serie;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Turma: " + getId() + getSerie();
        output += "\nLista de disciplinas: \n";
        for (Disciplina d : getDisciplinas())
            output += d.toString();
        output += "\nLista de alunos: \n";
        for (Estudante e : getEstudantes())
            output += e.toString();
        return output;
    }

}
