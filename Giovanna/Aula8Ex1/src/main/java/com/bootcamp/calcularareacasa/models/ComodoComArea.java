package com.bootcamp.calcularareacasa.models;

public class ComodoComArea {
    private String nome;
    private double largura;
    private double comprimento;
    private double area;

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

    public ComodoComArea(String nome, double largura, double comprimento) {
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }
    public ComodoComArea(Comodo comodo){
        this.nome = comodo.getNome();
        this.largura = comodo.getLargura();
        this.comprimento = comodo.getComprimento();
        this.area = comodo.calcularArea();
    }
    public ComodoComArea() {
    }
}
