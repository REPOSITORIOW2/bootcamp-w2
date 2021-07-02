package br.com.meli.bootcamp_aula0107.model.dto;

import br.com.meli.bootcamp_aula0107.model.Casa;
import br.com.meli.bootcamp_aula0107.model.Comodo;

import java.util.List;
import java.util.stream.Collectors;

public class CasaDTO {

    private static double VALOR_POR_METRO = 800;

    private String nome;
    private String endereco;
    private List<ComodoDTO> comodos;
    private ComodoDTO maiorComodo;
    private double valor;
    private double totalMetros;


    public CasaDTO() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<ComodoDTO> getComodos() {
        return comodos;
    }

    public void setComodos(List<ComodoDTO> comodos) {
        this.comodos = comodos;
    }

    public ComodoDTO getMaiorComodo() {
        return maiorComodo;
    }

    public void setMaiorComodo(ComodoDTO maiorComodo) {
        this.maiorComodo = maiorComodo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTotalMetros() {
        return totalMetros;
    }

    public void setTotalMetros(double totalMetros) {
        this.totalMetros = totalMetros;
    }

    public void atualizaDados() {
        comodos.sort(null);
        maiorComodo = comodos.get(0);
        totalMetros = (comodos.stream().mapToDouble(ComodoDTO::getArea).sum());
        valor = 800 * totalMetros;
    }

    public Casa converteParaModel() {
        Casa casa = new Casa();
        casa.setComodos(comodos.stream().map(ComodoDTO::converteParaModel).collect(Collectors.toList()));
        casa.setEndereco(endereco);
        casa.setNome(nome);

        return casa;
    }
}
