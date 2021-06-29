package com.meli.aula04.dakar;

import java.util.Objects;

public abstract class Veiculo {
    private final double velocidade;
    private final double aceleracao;
    private final double anguloDeGiro;
    protected String placa;
    private final double peso;
    private final int rodas;
    private final double poder;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;

        poder = poder();
    }


    private double poder(){
        return velocidade * aceleracao / (anguloDeGiro * (peso - (rodas * 1000)));
    }

    public double getPoder(){
        return poder;
    }

    public String getPlaca(){
        return placa;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "placa='" + placa + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Veiculo veiculo = (Veiculo) o;

        if (Double.compare(veiculo.velocidade, velocidade) != 0) return false;
        if (Double.compare(veiculo.aceleracao, aceleracao) != 0) return false;
        if (Double.compare(veiculo.anguloDeGiro, anguloDeGiro) != 0) return false;
        if (Double.compare(veiculo.peso, peso) != 0) return false;
        if (rodas != veiculo.rodas) return false;
        return Objects.equals(placa, veiculo.placa);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(velocidade);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(aceleracao);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(anguloDeGiro);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (placa != null ? placa.hashCode() : 0);
        temp = Double.doubleToLongBits(peso);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + rodas;
        return result;
    }
}
