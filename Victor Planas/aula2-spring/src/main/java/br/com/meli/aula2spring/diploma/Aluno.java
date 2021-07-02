package br.com.meli.aula2spring.diploma;

import java.util.Arrays;
import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String calculaMedia() {

        double media = this.notas.stream().mapToDouble(d -> d).average().orElse(0.0);

        if (media > 9) return "Parabens! A média do aluno: " + this.nome + " é igual a " + media;
        return "A media do aluno: " + nome + " é igual a " + media;
    }
}
