package br.com.mercadolivre.calculadora;

import java.util.List;
import java.util.stream.Collectors;

public class ComodoDTO {
    private String nome;
    private double metroQuadrado;

    ComodoDTO(Comodo comodo) {
        this.nome = comodo.getNome();
        this.metroQuadrado = comodo.getMetroQuadrado();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMetroQuadrado() {
        return metroQuadrado;
    }

    public void setMetroQuadrado(double metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public static List<ComodoDTO> converter(List<Comodo> comodos) {
        return comodos.stream().map(ComodoDTO::new).collect(Collectors.toList());
    }
}
