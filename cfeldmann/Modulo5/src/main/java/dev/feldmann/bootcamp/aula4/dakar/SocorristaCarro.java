package dev.feldmann.bootcamp.aula4.dakar;

public class SocorristaCarro extends Socorrista {

    public SocorristaCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        super(velocidade, aceleracao, anguloDeGiro, placa);
    }


    public void socorrer(Carro carro) {
        System.out.println("Socorrendo Carro");
        System.out.println("Placa do carro sendo socorrido: " + carro.getPlaca());
    }
}
