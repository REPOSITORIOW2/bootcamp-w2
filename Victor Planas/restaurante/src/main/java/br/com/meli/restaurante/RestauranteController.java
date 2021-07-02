package br.com.meli.restaurante;

import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {
    private double caixa;
    private Restaurante restaurante = new Restaurante();

    @GetMapping("/todospedidos/{idMesa}")
    public List<Object> getListaPedido(@PathVariable int idMesa){
        Mesa mesa = restaurante.getMesaByID(idMesa);
        List<Object> lista = new ArrayList<>();
        lista.add(mesa.getListaPedidos());
        lista.add(mesa.consumoTotal());
        return lista;
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
    public List<Pedido> adicionaPedido(@RequestBody List<Prato> pratos, @PathVariable int idMesa){
        Mesa mesa = restaurante.getMesaByID(idMesa);
        System.out.println(mesa);
        return mesa.adicionaPedido(new Pedido(restaurante.getNumeroPedido(), mesa, pratos));
    }


}
