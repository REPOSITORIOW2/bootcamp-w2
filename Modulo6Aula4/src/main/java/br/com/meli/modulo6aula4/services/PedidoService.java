package br.com.meli.modulo6aula4.services;

import br.com.meli.modulo6aula4.dtos.PedidoDTO;
import br.com.meli.modulo6aula4.dtos.UsuarioPedidoDTO;
import br.com.meli.modulo6aula4.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    PedidoRepository pedidoRepository;

    public PedidoDTO adicionaPedido(UsuarioPedidoDTO usuarioPedido) {

        return pedidoRepository.add(usuarioPedido);
    }

    public List<PedidoDTO> getAll() {
        return pedidoRepository.getList();
    }

    public PedidoDTO getById(Long id){
        return pedidoRepository.getById(id);
    }

    public void deletarPedido(Long id) {

        pedidoRepository.deletar(pedidoRepository.getById(id));
    }

}
