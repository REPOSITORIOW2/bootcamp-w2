package br.com.mercadolivre.ecommerce_novo.Pedido;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadPedidoService {

    private PedidoRepository pedidoRepository;

    public ReadPedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public Pedido execute(Long id) {
        return pedidoRepository.findById(id);
    }

    public List<Pedido> executeByUser(Long usuarioId) {
        return pedidoRepository.findAllUser(usuarioId);
    }
}
