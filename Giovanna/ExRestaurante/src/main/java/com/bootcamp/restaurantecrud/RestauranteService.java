package com.bootcamp.restaurantecrud;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@Service
public class RestauranteService {
    private static HashMap<Long, Mesa> mesas = new HashMap<Long,Mesa>();
    static{
        mesas.put(0L, new Mesa(0));
        mesas.put(1L, new Mesa(1));
        mesas.put(2L, new Mesa(2));
        mesas.put(3L, new Mesa(3));
        mesas.put(4L, new Mesa(4));
        mesas.put(5L, new Mesa(5));
        mesas.put(6L, new Mesa(6));
        mesas.put(7L, new Mesa(7));
        mesas.put(8L, new Mesa(8));
    }

    public static double valorNoCaixa = 0;

    public String itensPedidoETotal(long idMesa){
        var mesa = mesas.get(idMesa);
        mesa.getValorTotalConsumido();
        return mesa.toString();
    }

    public boolean fecharMesa(long idMesa){
        var mesa =  mesas.get(idMesa);
        valorNoCaixa += mesa.getValorTotalConsumido();
        mesa.limparMesa();
        return true;
    }

    public double valorNoCaixa(){
        return valorNoCaixa;
    }
    public Pedido savePedido(Pedido pedido){
        var mesa =  mesas.get(pedido.getIdmesa());
        mesa.adicionarPedido(new Pedido(pedido));
        return pedido;
    }
}
