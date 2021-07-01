package br.com.meli.home.dto;

import br.com.meli.home.entity.Comodo;
import br.com.meli.home.entity.Home;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.List;

public class HomeDTO {

    private String nome;
    private String endereco;
    private List<Comodo> comodos;

    public HomeDTO(String nome, String endereco, List<Comodo> comodos) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = comodos;
    }

    public HomeDTO(){}

    public HomeDTO convert(Home h){

        return new HomeDTO(h.getNome(), h.getEndereco(), h.getComodos());

    }

    public double getAreaTotal(){

        return comodos.stream().mapToDouble(Comodo::getArea).sum();

    }

    public Comodo getMaiorComodo(){

        return comodos.stream().max(Comparator.comparing(Comodo::getArea)).orElseThrow(RuntimeException::new);

    }

    public String getValorCasa(){

        NumberFormat f = new DecimalFormat("#0.00");

        return "R$" +  f.format(800 * getAreaTotal());

    }

    public List<Comodo> getComodos() {
        return comodos;
    }

}
