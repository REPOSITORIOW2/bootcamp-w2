package com.example.restaurante.service;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Getter
public class Restaurante {

    List<Mesa> mesaList;
    Double caixa;

    public Restaurante() {
        this.mesaList = new ArrayList<>();
        this.caixa = 100.0;

        Pratos prato1 = new Pratos(1, 10.0, "prato1", 1);
        Pratos prato2 = new Pratos(2, 20.0, "prato2", 2);
        Pratos prato3 = new Pratos(3, 30.0, "prato3", 3);

        List<Pratos> listaprato1= new ArrayList<>();
        List<Pratos> listaprato2= new ArrayList<>();

        listaprato1.add(prato1);
        listaprato1.add(prato2);
        listaprato2.add(prato2);
        listaprato2.add(prato3);

        Pedido pedido1 = new Pedido(01, listaprato1);
        Pedido pedido2 = new Pedido(02, listaprato2);

        List<Pedido> pedidos1= new ArrayList<>();
        List<Pedido> pedidos2= new ArrayList<>();

        pedidos1.add(pedido1);
        pedidos1.add(pedido2);
        pedidos2.add(pedido2);


        Mesa mesa1 = new Mesa(pedidos1);
        Mesa mesa2 = new Mesa(pedidos2);

        mesaList.add(mesa1);
        mesaList.add(mesa1);
        mesaList.add(mesa2);
    }

    public Mesa addPedidoMesa (Pedido pedido, Integer numMesa) {

        Mesa actMesa = mesaList.get(numMesa);
        actMesa.getPedidosList().add(pedido);

        return actMesa;
    }

    public Map<String, Double> totalCaixa() {
        Map<String, Double> actual = new HashMap<>();
        actual.put("caixa", caixa);
        return actual;
    }

    public Map<String, List<Mesa>> actualRestaurante() {
        Map<String, List<Mesa>> actual = new HashMap<>();
        actual.put("atual", mesaList);
        return actual;
    }

    public Mesa pedidoMesa(Integer numMesa) {
        return mesaList.get(numMesa);
    }

    public Map<String, String> pagarMesa(Integer numMesa) {
        List<Pedido> listPedidos = mesaList.get(numMesa).getPedidosList();
        Mesa clearMesa = new Mesa();

        for (int i = 0; i < listPedidos.size(); i++){
            List<Pratos> listPrato = listPedidos.get(i).getPratosList();
            for (int j = 0; j < listPrato.size(); j++){
                Pratos pratoAct = listPrato.get(j);
                caixa += pratoAct.getPreco() * pratoAct.getQuantidade();
            }
        }

//        listPedidos.remove(numMesa);
//        mesaList.set(numMesa, clearMesa);

        mesaList.remove(numMesa.intValue());

        Map<String, String> retorno = new HashMap<>();
        retorno.put("result", "Removido");

        return retorno;
    }
}
