package br.com.meli.bootcamp_aula0107.model;

import br.com.meli.bootcamp_aula0107.model.dto.ComodoDTO;

public class Comodo {

    private String nome;
    private double largura;
    private double comprimento;

    public Comodo() {
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

    public ComodoDTO converteParaDTO() {
        ComodoDTO comodoDTO = new ComodoDTO();
        comodoDTO.setComprimento(comprimento);
        comodoDTO.setLargura(largura);
        comodoDTO.setNome(nome);

        return comodoDTO;
    }
}
