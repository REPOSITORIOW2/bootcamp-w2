package br.com.meli.restaurante;

import br.com.meli.restaurante.repository.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    private double caixa;

    @Autowired
    private Restaurante restaurante;
    @Autowired
    private RestauranteRepository repository;



    @GetMapping("/todospedidos/{idMesa}")
    public List<Pedido> getListaPedido(@PathVariable int idMesa){
        Mesa mesa = restaurante.getMesaByID(idMesa);
        List<Object> lista = new ArrayList<>();
        lista.add(mesa.getListaPedidos());
        lista.add(mesa.consumoTotal());
        List<Pedido> retorno = repository.loadResource();
        return retorno;
    }

    @GetMapping("/fecha/{idMesa}")
    public double fechaMesa(@PathVariable int idMesa){
        Mesa mesa = restaurante.getMesaByID(idMesa);
        double caixa = restaurante.getCaixa();
        caixa += mesa.fechaMesa();
        restaurante.setCaixa(caixa);
        return caixa;
    }

    @GetMapping("/caixa")
    public double getCaixa() {
        return restaurante.getCaixa();
    }


    @PostMapping("/adicionamesa")
    public Mesa adicionaMesa(){
        return restaurante.adicionaMesa();
    }

    @PostMapping("/adicionapedido/{idMesa}")
    public List<Pedido> adicionaPedido(@RequestBody List<Prato> pratos, @PathVariable int idMesa) throws IOException {
        Mesa mesa = restaurante.getMesaByID(idMesa);
        return mesa.adicionaPedido(new Pedido(restaurante.getNumeroPedido(), mesa, pratos));
    }

    @DeleteMapping("/deletePedido/{idMesa}/{idPedido}")
    public boolean removePedido(@PathVariable int idMesa, @PathVariable int idPedido) throws IOException {
        Mesa mesa = restaurante.getMesaByID(idMesa);
        return mesa.removePedidoByID(idPedido);
    }

    @PutMapping("/updatePedido/{idMesa}/{idPedido}")
    public List<Pedido> updatePedido(@PathVariable int idMesa, @PathVariable int idPedido, @RequestBody List<Prato> pratos) throws IOException {
        removePedido(idMesa,idPedido);
        return adicionaPedido(pratos, idMesa);
    }


}
