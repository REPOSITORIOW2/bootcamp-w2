package com.melibootcamp;

import java.util.List;

public class Corrida {
    private double distancia;
    private double premioEmDolares;
    private String nome;
    private int quantidadeDeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    private SocorristaCarro socorristaCarro;
    private SocorristaMoto socorristaMoto;

    public void registrarCarro(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        listaVeiculos.add(new Carro(velocidade,aceleracao,anguloDeGiro,placa));
    }
    public void registrarMoto(double velocidade, double aceleracao, double anguloDeGiro, String placa){
        listaVeiculos.add(new Moto(velocidade,aceleracao,anguloDeGiro,placa));
    }
    public void removerVeiculo(Veiculo veiculo){
        listaVeiculos.remove(veiculo);
    }
    public void removerVeiculoPorPlaca(String placa){
        listaVeiculos.remove(getVeiculoByPlaca(placa));
    }

    public Veiculo retornarVencedor(){
        double pontuacaoVencedora = 0 ;
        Veiculo veiculoVencedor = null;
        for(int i=0; i< listaVeiculos.size(); i++){
            var veiculoAtual = listaVeiculos.get(i);
            var pontuacao = veiculoAtual.getVelocidade() *  veiculoAtual.getAceleracao()
                    / ( veiculoAtual.getAnguloDeGiro() * (veiculoAtual.getPeso() - veiculoAtual.getRodas() * 100));
                    if(pontuacao > pontuacaoVencedora)
                    {
                        pontuacaoVencedora = pontuacao;
                        veiculoVencedor = veiculoAtual;
                    }
        }
        return veiculoVencedor;
    }
    public Veiculo getVeiculoByPlaca(String Placa){
        return listaVeiculos.stream().filter(c -> Placa.equals(c.getPlaca())).findFirst().orElse(null);
    }
    public void socorrerCarro(String documento){
        socorristaCarro.socorrer((Carro) getVeiculoByPlaca(documento));
    }
    public void socorrerMoto(String documento){
        socorristaMoto.socorrer((Moto) getVeiculoByPlaca(documento));
    }


}
