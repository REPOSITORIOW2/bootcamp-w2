package meli.bootcamp.spring.metrosquadrados.domain;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Casa {
    private String nome;
    private String endereco;
    private List<Comodo> comodos;
    private double areaTotal;
    private static final double PRECO_M2 = 800.0;

    public Casa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.comodos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Comodo> getComodos() {
        return comodos;
    }
    public void addComodo(Comodo comodo){
        this.comodos.add(comodo);
        this.areaTotal += comodo.area();
    }

    public double getAreaTotal(){
        return this.areaTotal;
    }

    public double preco(){
        return this.areaTotal * PRECO_M2;
    }

    public Optional<Comodo> maiorComodo(){
        return this.comodos.stream().max(Comparator.comparing(Comodo::area));
    }


}

