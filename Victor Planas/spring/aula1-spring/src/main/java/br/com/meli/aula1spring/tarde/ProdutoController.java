package br.com.meli.aula1spring.tarde;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/produto")
public class ProdutoController {


    @Autowired
    private ProdutoService service;

    @PostMapping("/adicionar")
    public Produto create(@RequestBody Produto produto) {
        return service.createProduto(produto.getNome(), produto.getPreco(), produto.getQuantidade());
    }

    @DeleteMapping("/delete/{codigo}")
    public void delete(@PathVariable int codigo) {
        service.deleteProduto(codigo);
    }

    @GetMapping("/read")
    public void read() {
        service.readProduto();
    }

    @PutMapping("/update/{codigo}")
    public Produto update(@PathVariable int codigo, @RequestBody Produto novo) {
        return service.updateProduto(codigo, novo.getNome(), novo.getPreco(), novo.getQuantidade());
    }
}
