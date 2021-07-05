package br.com.meli.ecommerce.controller;

import br.com.meli.ecommerce.dto.PedidoDTO;
import br.com.meli.ecommerce.entity.Pedido;
import br.com.meli.ecommerce.entity.Produto;
import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.service.PedidoService;
import br.com.meli.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoService service;
    private UsuarioService usuarioService;

    @Autowired
    public PedidoController(PedidoService service, UsuarioService usuarioService) {
        this.service = service;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<PedidoDTO> getPedidos() {
        return PedidoDTO.converter(service.getList());
    }

    @PostMapping("/criar")
    @ResponseStatus(HttpStatus.CREATED)
    public void addPedido(@RequestHeader String cpf, @RequestBody List<String> codigoProdutos) {
        Usuario usuario = usuarioService.getUsuarioByCPF(cpf);
        service.addPedido(usuario, codigoProdutos);
    }

    @GetMapping("/{cpf}/visualizar")
    @ResponseStatus(HttpStatus.OK)
    public List<Pedido> getPedidosByCpf(@PathVariable String cpf) {
        return service.getPedidosByUsuario(cpf);
    }

    @GetMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public Pedido getPedidoByCodigo(@PathVariable int codigo) {
        return service.getPedidoByCodigo(codigo);
    }
}
