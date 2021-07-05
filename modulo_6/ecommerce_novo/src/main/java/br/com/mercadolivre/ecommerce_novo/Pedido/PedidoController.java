package br.com.mercadolivre.ecommerce_novo.Pedido;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private final AdicionarPedidoService adicionarPedidoService; 

    public PedidoController(AdicionarPedidoService adicionarPedidoService) {
        this.adicionarPedidoService = adicionarPedidoService;
    }

    @PostMapping
    public ResponseEntity<String> adicionaProdutoPedido(@RequestBody PedidoDTO pedidoDTO){
        return new ResponseEntity<>(adicionarPedidoService.execute(PedidoDTO.converte(pedidoDTO)), HttpStatus.OK);
    }

}
