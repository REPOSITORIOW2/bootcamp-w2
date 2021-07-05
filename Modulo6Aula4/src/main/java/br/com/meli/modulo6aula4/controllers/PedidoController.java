package br.com.meli.modulo6aula4.controllers;

import br.com.meli.modulo6aula4.dtos.*;
import br.com.meli.modulo6aula4.enums.UsuarioEnum;
import br.com.meli.modulo6aula4.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "/api/pedido")
@RestController
public class PedidoController {

    @Autowired
    PedidoService pedidoService;

    @PostMapping(value = "/cadastrar")
    public ResponseEntity<PedidoDTO> CadastrarPedido(@RequestBody UsuarioPedidoDTO usuarioPedido) {

        PedidoDTO pedidoDTO = pedidoService.adicionaPedido(usuarioPedido);

        return ResponseEntity.ok(pedidoDTO);
    }
    @GetMapping(value = "/obter/{id}")
    public ResponseEntity ObterPedido(@PathVariable(value = "id") Long id) {

        return ResponseEntity.ok(pedidoService.getById(id));
    }

    @DeleteMapping(value = "/deletar/{id}")
    public ResponseEntity DeletarPedido(@PathVariable(value = "id") Long id) {

        pedidoService.deletarPedido(id);
        return ResponseEntity.status(202).build();

    }
}
