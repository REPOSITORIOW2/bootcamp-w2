package br.com.meli.aula2spring.metros;

import java.util.List;

public class Casa {
    private String nome;
    private String endereco;
    private List<Comodo> comodos;

    public Casa(String nome, String endereco, List<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }
}
