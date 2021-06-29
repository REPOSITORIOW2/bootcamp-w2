package com.meli.aula04.dakar;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Corrida {
    private double distancia;
    private final BigDecimal premioEmDolares;
    private final String nome;
    private final int quantidadeDeVeiculosPermitidos;
    private final Collection<Veiculo> listaVeiculos = new ArrayList<>();
    private final br.com.meli.aula4.dakar.Socorrista<Carro> socorristaCarro = new br.com.meli.aula4.dakar.Socorrista<>();
    private final br.com.meli.aula4.dakar.Socorrista<br.com.meli.aula4.dakar.Moto> socorristaMoto = new br.com.meli.aula4.dakar.Socorrista<>();

    public Corrida(BigDecimal premioEmDolares, String nome, int quantidadeDeVeiculosPermitidos) {
        this.premioEmDolares = premioEmDolares;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    private void registrarVeiculo(Veiculo carro){
        boolean temEspaco = listaVeiculos.size() < quantidadeDeVeiculosPermitidos;
        boolean placaJaAdicionada = listaVeiculos.stream()
                .map(Veiculo::getPlaca).collect(Collectors.toSet()).contains(carro.getPlaca());


        if (!temEspaco)
            throw new VeiculoCorridaException("Corrida já está lotada");
        if (placaJaAdicionada)
            throw new VeiculoCorridaException("Veículo já adicionado");

        listaVeiculos.add(carro);
    }

    public void registarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        registrarVeiculo(new Carro(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void registarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        registrarVeiculo(new br.com.meli.aula4.dakar.Moto(velocidade, aceleracao, anguloDeGiro, placa));
    }

    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }
    public void removerVeiculo(String placa){
        listaVeiculos.removeIf(a -> a.getPlaca().equals(placa));
    }

    public Veiculo vencedor(){
        return listaVeiculos.stream().max(Comparator.comparingDouble(Veiculo::getPoder))
                .orElseThrow(VeiculoCorridaException::new);
    }

    public Optional<Veiculo> encontrarVeiculo(String placa){
        return listaVeiculos.stream().filter(a -> a.getPlaca().equals(placa)).findFirst();
    }

    public void socorrer(String placa){
        var c = listaVeiculos.stream().filter(a -> a.getPlaca().equals(placa)).
                findFirst().orElseThrow(VeiculoCorridaException::new);

        if (c instanceof Carro) {
            socorristaCarro.socorrer(c);
        }
        if (c instanceof br.com.meli.aula4.dakar.Moto) {
            socorristaMoto.socorrer(c);
        }

    }

    @Override
    public String toString() {
        return "Corrida " + nome +"{" +
                "distancia=" + distancia +
                ", premioEmDolares='" + premioEmDolares + '\'' +
                '}';
    }
}
