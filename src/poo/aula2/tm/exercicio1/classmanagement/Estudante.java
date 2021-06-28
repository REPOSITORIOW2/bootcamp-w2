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

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public int getIdade() {
        return idade;
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
