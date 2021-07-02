package br.com.meli.cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loja")
public class LojaController {
    private Loja loja = new Loja();

    @PostMapping("/adicionaPedido/{idCli}")
    public boolean adcionaPedido(@RequestBody List<Produto> produtos, @PathVariable int idCli){
        Cliente cli = loja.getClienteById(idCli);
        return cli.adicionaPedido(new Pedido(loja.getNumPedidos(),produtos,cli));
    }

    @PostMapping("/adicionaCliente")
    public Cliente adicionaCliente(@RequestBody Cliente cliente){
        return loja.adicionaCliente(cliente);
    }

    @GetMapping("/listapedidos/{idCli}")
    public List<Pedido> listaPedidos(@PathVariable int idCli){
        return loja.getClienteById(idCli).getPedidos();
    }
}
