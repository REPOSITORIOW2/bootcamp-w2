package br.com.mercadolivre.ecommerce_novo.Pedido;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.mercadolivre.ecommerce_novo.Produto.Produto;
import br.com.mercadolivre.ecommerce_novo.Usuario.Usuario;

@Repository
public class PedidoRepository {
    private static List<Pedido> pedidos;

    public PedidoRepository() {
        pedidos = new ArrayList<>();
    }

    public boolean adcionaPedido(Pedido pedido){
        return pedidos.add(pedido);
    }
}
