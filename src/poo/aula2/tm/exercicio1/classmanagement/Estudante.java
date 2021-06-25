package poo.aula2.tm.exercicio1.classmanagement;

public class Estudante {

    private String nome;
    private String numeroMatricula;
    private String serie;
    private int idade;

    public Estudante(String nome, String numeroMatricula, String serie, int idade) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.serie = serie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", numeroMatricula='" + numeroMatricula + '\'' +
                ", serie='" + serie + '\'' +
                ", idade=" + idade +
                '}';
    }
}
