package meli.classes;

public class Estudante {
    private String nome;
    private int idade;
    private int matricula;
    private Turma turma;

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Estudante(String nome, int idade, int matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s - Idade: %d - Matricula: %d - Serie: %s - %s", getNome(), getIdade(), getMatricula(), this.turma.getSerie(), this.turma.getCodigo());
    }
}
