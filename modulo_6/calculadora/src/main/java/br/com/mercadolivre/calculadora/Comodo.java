package br.com.mercadolivre.calculadora;

public class Comodo {

    private String nome;
    private double largura;
    private double comprimento;
    private double metroQuadrado;

    public Comodo(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
        this.metroQuadrado = this.largura * this.comprimento;
    }

    public double getMetroQuadrado() {
        return metroQuadrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }
}