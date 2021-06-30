package br.com.meli.modulo5.dia2.TM;

public class Disciplina {

    private String nome;

    private String ch;

    Disciplina(String nome, String ch) {
        this.nome = nome;
        this.ch = ch;
    }

    public String toString() {
        return String.format("Disciplina: "+this.nome+ "- carga horária:" +this.ch);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }
}
