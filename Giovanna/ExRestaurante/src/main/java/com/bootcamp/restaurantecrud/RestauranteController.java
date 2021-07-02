package com.bootcamp.restaurantecrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @PostMapping("/addPedido")
    public ResponseEntity<Pedido> post(@RequestBody Pedido pedido) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.savePedido(pedido));
    }

    @GetMapping("/itensPedidoETotal/{idMesa}")
    public ResponseEntity<String> itensPedidoETotal(@RequestParam Long idMesa) {
        return ResponseEntity.ok(service.itensPedidoETotal(idMesa));
    }

    @GetMapping("/fecharMesa/{idMesa}")
    public ResponseEntity<Boolean> fecharMesa(@RequestParam Long idMesa) {
        return ResponseEntity.ok(service.fecharMesa(idMesa));
    }

}
