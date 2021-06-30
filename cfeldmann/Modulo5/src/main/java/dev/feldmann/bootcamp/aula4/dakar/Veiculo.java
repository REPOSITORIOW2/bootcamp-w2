package dev.feldmann.bootcamp.aula4.dakar;

public class Veiculo {

    private double velocidade;
    private double aceleracao;
    private double anguloDeGiro;
    private String placa;
    private double peso;
    private int rodas;

    public Veiculo(double velocidade, double aceleracao, double anguloDeGiro, String placa, double peso, int rodas) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.placa = placa;
        this.peso = peso;
        this.rodas = rodas;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public String getPlaca() {
        return placa;
    }

    public double getPeso() {
        return peso;
    }

    public int getRodas() {
        return rodas;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "velocidade=" + velocidade +
                ", aceleracao=" + aceleracao +
                ", anguloDeGiro=" + anguloDeGiro +
                ", placa='" + placa + '\'' +
                ", peso=" + peso +
                ", rodas=" + rodas +
                '}';
    }
}
