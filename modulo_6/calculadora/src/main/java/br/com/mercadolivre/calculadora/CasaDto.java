package br.com.mercadolivre.calculadora;

import java.util.List;

public class CasaDto {
    private double totalMetros;
    private double valor;
    private ComodoDTO maiorComodo;
    private List<ComodoDTO> comodos;

    public CasaDto(double totalMetros, double valor, ComodoDTO maiorComodo, List<ComodoDTO> comodos) {
        this.totalMetros = totalMetros;
        this.valor = valor;
        this.maiorComodo = maiorComodo;
        this.comodos = comodos;
    }

    public double getTotalMetros() {
        return totalMetros;
    }

    public void setTotalMetros(double totalMetros) {
        this.totalMetros = totalMetros;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ComodoDTO getMaiorComodo() {
        return maiorComodo;
    }

    public void setMaiorComodo(ComodoDTO maiorComodo) {
        this.maiorComodo = maiorComodo;
    }

    public List<ComodoDTO> getComodos() {
        return comodos;
    }

    public void setComodos(List<ComodoDTO> comodos) {
        this.comodos = comodos;
    }
}
