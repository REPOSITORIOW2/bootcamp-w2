package com.melibootcamp;

public class Arma
{
    private String nome;
    private double danoBase;
    private EnumTipoArma tipoArma;

    public Arma(String nome, double danoBase, EnumTipoArma tipoArma) {
        this.nome = nome;
        this.danoBase = danoBase;
        this.tipoArma = tipoArma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDanoBase() {
        return danoBase;
    }

    public void setDanoBase(double danoBase) {
        this.danoBase = danoBase;
    }

    public EnumTipoArma getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(EnumTipoArma tipoArma) {
        this.tipoArma = tipoArma;
    }


}
