package Ex01_tm;

public class Estudante {

    private String nome;
    private int idade;
    private int matricula;
    private String estudanteSerie;

    public Estudante(String nome, int idade, int matricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.estudanteSerie = serie;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getSerie() {
        return estudanteSerie;
    }
}
