package aula4;

public class Estudante {
    private String nome;
    private Integer idade;
    private Integer numMatricula;
    private String serie;

    public Estudante(String nome, Integer idade, Integer numMatricula, String serie) {
        this.nome = nome;
        this.idade = idade;
        this.numMatricula = numMatricula;
        this.serie = serie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(Integer numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return nome;
    }
}
