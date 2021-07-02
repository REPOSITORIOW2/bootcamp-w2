package dev.feldmann.bootcamp.modulo6.restaurante.controller;

import dev.feldmann.bootcamp.modulo6.restaurante.service.RestauranteService;
import dev.feldmann.bootcamp.modulo6.restaurante.dto.MesaDTO;
import dev.feldmann.bootcamp.modulo6.restaurante.dto.RestauranteInfoDTO;
import dev.feldmann.bootcamp.modulo6.restaurante.forms.PedidoForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Validated
@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    @Autowired
    private RestauranteService service;

    @PostMapping("/mesa/{id}/pedido")
    public ResponseEntity<?> fazerPedido(
            @NotNull @Min(0) @PathVariable Long id,
            @Valid @RequestBody PedidoForm form) {
        var mesa = service.findMesaById(id);
        if (mesa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        service.fazerPedido(mesa.get(), form);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/mesa/{id}/pedirConta")
    public ResponseEntity<MesaDTO> fecharPedidos(@NotNull @Min(0) @PathVariable Long id) {
        var findMesa = service.findMesaById(id);
        if (findMesa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        var mesa = findMesa.get();
        var dto = new MesaDTO(mesa.calculateTotalPrice(), mesa.getPedidos());
        service.fecharPedido(mesa);
        return ResponseEntity.ok(dto);
    }


    @GetMapping("/mesa/{id}")
    public ResponseEntity<MesaDTO> verPedidos(@NotNull @Min(0) @PathVariable Long id) {
        var findMesa = service.findMesaById(id);
        if (findMesa.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        var mesa = findMesa.get();
        var dto = new MesaDTO(mesa.calculateTotalPrice(), mesa.getPedidos());
        return ResponseEntity.ok(dto);
    }


    @GetMapping
    public RestauranteInfoDTO restauranteInfo() {
        return new RestauranteInfoDTO(
                service.getCaixa(),
                service.getDinheiroAReceber(),
                service.getMesasOcupadas(),
                service.getMesasLivres()
        );

    }

}
