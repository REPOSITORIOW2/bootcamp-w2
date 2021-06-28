package poo.aula2.tt;

import java.util.Date;

class Funcionario{

    private char sexo;
    private int jornada;
    private Double remuneracao;
    private String nome;
    private Date nascimento;

    public Funcionario(char sexo, int jornada, Double remuneracao, String nome, Date nascimento) {
        this.sexo = sexo;
        this.jornada = jornada;
        this.remuneracao = remuneracao;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getJornada() {
        return jornada;
    }

    public void setJornada(int jornada) {
        this.jornada = jornada;
    }

    public Double getRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(Double remuneracao) {
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "sexo=" + sexo +
                ", jornada=" + jornada +
                ", remuneracao=" + remuneracao +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                '}';
    }
}
