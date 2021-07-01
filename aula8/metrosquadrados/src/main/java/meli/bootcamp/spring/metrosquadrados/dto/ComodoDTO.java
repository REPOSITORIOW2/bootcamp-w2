package meli.bootcamp.spring.metrosquadrados.dto;

import meli.bootcamp.spring.metrosquadrados.domain.Comodo;

public class ComodoDTO {
    private String nome;
    private double area;

    public ComodoDTO(Comodo comodo) {
        this.nome = comodo.getNome();
        this.area = comodo.area();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
