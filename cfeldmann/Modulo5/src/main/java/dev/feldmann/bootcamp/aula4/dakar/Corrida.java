package dev.feldmann.bootcamp.aula4.dakar;

import java.util.*;

public class Corrida {

    private String nome;
    private double distancia;
    private double premioEmDolares;
    private int quantidadeVeiculosPermitidos;
    private HashMap<String, Veiculo> veiculosPorPlaca;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;


    public Corrida(String nome, double distancia, double premioEmDolares, int quantidadeVeiculosPermitidos) {
        this.nome = nome;
        this.distancia = distancia;
        this.premioEmDolares = premioEmDolares;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        veiculosPorPlaca = new HashMap<>();
        socorristaCarro = new SocorristaCarro(6, 7.2, 45, "SOCCORROOOOOO");
        socorristaMoto = new SocorristaMoto(6, 7.2, 45, "SOCCORRO MOTO");
    }


    private void registrarVeiculo(Veiculo veiculo) {
        if(this.veiculosPorPlaca.containsKey(veiculo.getPlaca())){
            throw new IllegalArgumentException("Veiculo já está registrado no evento!");
        }
        if(this.veiculosPorPlaca.size() >= this.quantidadeVeiculosPermitidos){
            throw new IllegalArgumentException("Evento já está lotado!");
        }
        this.veiculosPorPlaca.put(veiculo.getPlaca(), veiculo);
    }

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        this.registrarVeiculo(new Carro(velocidade, aceleracao, anguloDeGiro, placa));

    }

    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa) {
        this.registrarVeiculo(new Moto(velocidade, aceleracao, anguloDeGiro, placa));
    }


    public void removerVeiculo(Veiculo veiculo) {
        veiculosPorPlaca.entrySet().removeIf(entry -> entry.getValue().equals(veiculo));
    }

    public void removerVeiculoPorPlaca(String placa) {
        veiculosPorPlaca.remove(placa);
    }

    public double calculateTime(Veiculo veiculo) {
        return (veiculo.getVelocidade() * veiculo.getAceleracao()) /
                (veiculo.getAnguloDeGiro() * (veiculo.getPeso() - veiculo.getRodas() * 100));
    }

    public Veiculo calculateWinner() {
        var max = this.veiculosPorPlaca.values().stream()
                .max(Comparator.comparingDouble(this::calculateTime));
        // Crime
        return max.orElse(null);
    }


    public void socorrerMoto(String placa) {
        Veiculo veiculo = this.veiculosPorPlaca.get(placa);
        if (veiculo instanceof Moto) {
            this.socorristaMoto.socorrer((Moto) veiculo);
        }
    }

    public void socorrerCarro(String placa) {
        Veiculo veiculo = this.veiculosPorPlaca.get(placa);
        if (veiculo instanceof Carro) {
            this.socorristaCarro.socorrer((Carro) veiculo);
        }
    }


}





