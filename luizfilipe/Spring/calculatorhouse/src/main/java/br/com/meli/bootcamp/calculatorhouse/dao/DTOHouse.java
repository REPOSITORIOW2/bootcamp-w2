package br.com.meli.bootcamp.calculatorhouse.dao;

public class DTOHouse {
    String resultado;
    Double valor;

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public DTOHouse(String resultado, Double valor) {
        this.resultado = resultado;
        this.valor = valor;
    }
}
