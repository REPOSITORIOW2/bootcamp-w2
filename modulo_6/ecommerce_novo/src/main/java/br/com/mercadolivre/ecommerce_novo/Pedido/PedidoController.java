package br.com.mercadolivre.ecommerce_novo.Pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private final AdicionarPedidoService adicionarPedidoService;
    private final ReadPedidoService readPedidoService;

    public PedidoController(AdicionarPedidoService adicionarPedidoService, ReadPedidoService readPedidoService) {
        this.adicionarPedidoService = adicionarPedidoService;
        this.readPedidoService = readPedidoService;
    }

    @PostMapping
    public ResponseEntity<String> adicionaProdutoPedido(@RequestBody PedidoDTO pedidoDTO){
        return new ResponseEntity<>(adicionarPedidoService.execute(PedidoDTO.converte(pedidoDTO)), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedido> readPedidoById(@PathVariable Long id) {
        return new ResponseEntity<>(readPedidoService.execute(id), HttpStatus.OK);
    }

    @GetMapping("/user/{usuarioId}")
    public ResponseEntity<List<Pedido>> readPedidoByUser(@PathVariable Long usuarioId) {
        return new ResponseEntity<>(readPedidoService.executeByUser(usuarioId), HttpStatus.OK);
    }

}
