package br.com.meli.aula2spring.metros;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CasaDAO {
    private static Map<Integer, Casa> casas = new HashMap<>();

    public double getMetrosQuadrados(Integer id) {
        Casa atual = casas.get(id);
        List<Comodo> lista = atual.getComodos();
        double metrosQuadrados = 0;
        for (Comodo comodo : lista) {
            metrosQuadrados += comodo.getComprimento() * comodo.getLargura();
        }
        return metrosQuadrados;
    }

    public double valorCasa(Integer id) {
        return 800 * getMetrosQuadrados(id);
    }

    public String maiorComodo(Integer id) {
        Casa atual = casas.get(id);
        List<Comodo> lista = new ArrayList<>();
        lista = atual.getComodos();
        Comodo maiorComodo = null;
        double comodoMaior = 0;
        for (Comodo comodo : lista) {
            if (comodo.getComprimento() * comodo.getLargura() > comodoMaior) {
                comodoMaior = comodo.getComprimento() * comodo.getLargura();
                maiorComodo = comodo;
            }
        }
        return maiorComodo.getNome();
    }

    public List<String> getMetrosQuadradosPorComodo(Integer id) {
        Casa atual = casas.get(id);
        List<Comodo> lista = atual.getComodos();
        double metrosQuadrados = 0;
        List<String> metrosPorComodo = new ArrayList<>();
        for (Comodo comodo : lista) {
            metrosQuadrados = comodo.getComprimento() * comodo.getLargura();
            metrosPorComodo.add(comodo.getNome() + ": " + metrosQuadrados);
        }
        return metrosPorComodo;
    }

    public Casa adicionaCasa(String nome, String endereco, List<Comodo> comodos) {
        Casa nova = new Casa(nome, endereco, comodos);
        casas.put(casas.size() + 1, nova);
        System.out.println(casas.size());
        return nova;
    }
}
