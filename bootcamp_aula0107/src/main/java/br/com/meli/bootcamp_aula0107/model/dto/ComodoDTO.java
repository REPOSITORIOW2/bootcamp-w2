package br.com.meli.bootcamp_aula0107.model.dto;

import br.com.meli.bootcamp_aula0107.model.Comodo;

public class ComodoDTO implements Comparable<ComodoDTO> {
    private String nome;
    private double largura;
    private double comprimento;
    private double area;

    public ComodoDTO() {
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

    public double getArea() {
        area = largura * comprimento;
        return area;
    }

    public Comodo converteParaModel() {
        Comodo comodo = new Comodo();
        comodo.setComprimento(comprimento);
        comodo.setLargura(largura);
        comodo.setNome(nome);

        return comodo;
    }

    @Override
    public int compareTo(ComodoDTO o) {
        return Double.compare(o.getArea(), getArea());
    }
}
