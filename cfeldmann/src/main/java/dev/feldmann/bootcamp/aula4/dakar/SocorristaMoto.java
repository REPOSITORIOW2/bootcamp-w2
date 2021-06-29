package dev.feldmann.bootcamp.aula4.dakar;

public class SocorristaMoto extends Socorrista {

    public SocorristaMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
    }

    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto");
        System.out.println("Placa da moto sendo socorrida: " + moto.getPlaca());
    }
}
