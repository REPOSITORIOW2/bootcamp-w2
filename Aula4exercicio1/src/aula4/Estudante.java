package aula4;

public class Estudante {
    private String nome;
    private int idade;
    private int matricula;
    private int serie;

    public Estudante(String nome, int idade, int matricula, int serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Matricula=" + matricula +
                ", Serie=" + serie +
                '}';
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

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
