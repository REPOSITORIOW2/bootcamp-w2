package br.com.meli.ecommerce.controller;

import br.com.meli.ecommerce.entity.Produto;
import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.service.ProdutoService;
import br.com.meli.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;
    private final UsuarioService usuarioService;

    @Autowired
    public ProdutoController(ProdutoService service, UsuarioService usuarioService) {
        this.service = service;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> getProdutos() {
        return service.getProdutos();
    }

    @GetMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public Produto getProdutoByCodigo(@PathVariable String codigo) {
        return service.getProdutoByCodigo(codigo);
    }

    @GetMapping("/categoria/{categoria}")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> getProdutosByCategoria(@PathVariable String categoria) {
        return service.getProdutosByCategoria(categoria);
    }

    @PostMapping("/adicionar")
    @ResponseStatus(HttpStatus.CREATED)
    public void addProduto(@RequestHeader String cpf, @RequestBody Produto produto) {
        Usuario usuario = usuarioService.getUsuarioByCPF(cpf);
        service.addProduto(usuario, produto);
    }

    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteProduto(@RequestHeader String cpf, @PathVariable String codigo) {
        Usuario usuario = usuarioService.getUsuarioByCPF(cpf);
        service.removerProduto(usuario, codigo);
    }

    @PutMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public void alterarProduto(@RequestHeader String cpf, @PathVariable String codigo, @RequestBody Produto produto) {
        Usuario usuario = usuarioService.getUsuarioByCPF(cpf);
        service.alterarProduto(usuario, codigo, produto);
    }

}
