package br.com.mercadolivre.ecommerce_novo.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public Pedido findById(Long id) {
        return pedidos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .get();
    }

    public List<Pedido> findAllUser(Long usuarioId) {
        return pedidos.stream()
                .filter(p -> p.getUsuarioId().equals(usuarioId))
                .collect(Collectors.toList());
    }
}
