package Dakar;

import java.util.ArrayList;
import java.util.List;

public class Corrida {

    private int distancia;
    private int premioEmDolar;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> veiculos;

    private SocorristaCarro sCar;
    private SocorristaMoto sMoto;

    public Corrida(int distancia, int premioEmDolar, String nome, int quantidadeVeiculosPermitidos) {

        this.distancia = distancia;
        this.premioEmDolar = premioEmDolar;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
        this.veiculos = new ArrayList<Veiculo>();
        this.sCar = new SocorristaCarro();
        this.sMoto = new SocorristaMoto();

    }
    public Corrida(){

    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getPremioEmDolar() {
        return premioEmDolar;
    }

    public void setPremioEmDolar(int premioEmDolar) {
        this.premioEmDolar = premioEmDolar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVeiculosPermitidos() {
        return quantidadeVeiculosPermitidos;
    }

    public void setQuantidadeVeiculosPermitidos(int quantidadeVeiculosPermitidos) {
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void registrarCarro(int velocidade, int aceleracao, int anguloDoGiro, String placa ){

        if(veiculos.size() < this.quantidadeVeiculosPermitidos){

            Carro carro = new Carro(placa);
            carro.setAceleracao(aceleracao);
            carro.setVelocidade(velocidade);
            carro.setAnguloDoGiro(anguloDoGiro);

            veiculos.add(carro);
        }

    }

    public void registrarMoto(int velocidade, int aceleracao, int anguloDoGiro, String placa ){

        if(veiculos.size() < this.quantidadeVeiculosPermitidos){
            Moto moto = new Moto(placa);

            moto.setAceleracao(aceleracao);
            moto.setVelocidade(velocidade);
            moto.setAnguloDoGiro(anguloDoGiro);
            veiculos.add(moto);
        }

    }

    public void removerVeiculo(Veiculo veiculo){
        veiculos.remove(veiculo);
    };

    public void removerVeiculoPorPlaca(String placa){
        veiculos.removeIf(item -> item.getPlaca().equals(placa) );
    }

    public Veiculo getVencedor(){

        Veiculo vencedor = null;
        double resultado = 0;
        double veiculoAtual = 0;

        for(Veiculo v : this.veiculos){
            veiculoAtual = (v.getVelocidade() * v.getAceleracao()) / (v.getAnguloDoGiro() * (v.getPeso()-v.getRodas()*100));
            if(veiculoAtual > resultado){
                resultado =veiculoAtual;
                vencedor = v;
            }
        }

        return vencedor;
    }

    public void socorrerCarro(String placa){
        this.sCar.socorrer(((Carro) this.veiculos.stream()
                                                .filter(v -> v.getPlaca().equals(placa))
                                                .findFirst().get()));
    }

    public void socorrerMoto(String placa){
        this.sMoto.socorrer(((Moto) this.veiculos.stream()
                                                .filter(v -> v.getPlaca().equals(placa))
                                                .findFirst().get()));
    }


}
