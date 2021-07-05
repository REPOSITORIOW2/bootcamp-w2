package br.com.mercadolivre.ecommerce_novo.Pedido;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mercadolivre.ecommerce_novo.Usuario.Usuario;

@Service
public class AdicionarPedidoService {

    private PedidoRepository repository;

    @Autowired
    public AdicionarPedidoService (PedidoRepository repository){
        this.repository = repository;
    }

    public String execute(Pedido pedido){
        repository.adcionaPedido(pedido);
        return "Pedido realizado com sucesso";
    }

}
