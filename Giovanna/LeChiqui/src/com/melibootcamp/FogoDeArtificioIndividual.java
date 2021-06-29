package com.melibootcamp;

public class FogoDeArtificioIndividual implements FogoDeArtificio{
    private String onomatopeiaBarulho;
    private String cor;

    public String getOnomatopeiaBarulho() {
        return onomatopeiaBarulho;
    }

    public void setOnomatopeiaBarulho(String onomatopeiaBarulho) {
        this.onomatopeiaBarulho = onomatopeiaBarulho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void Explodir() {
        System.out.println(getOnomatopeiaBarulho() + " e o ceu se enche da cor " + getCor());
    }

    public FogoDeArtificioIndividual(String onomatopeiaBarulho, String cor) {
        this.onomatopeiaBarulho = onomatopeiaBarulho;
        this.cor = cor;
    }
}
