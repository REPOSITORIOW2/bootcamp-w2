package com.bootcamp.crudprodutos;

import com.bootcamp.crudprodutos.models.Produto;
import com.bootcamp.crudprodutos.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    public ProdutoService service;

    @PostMapping("/addProduto")
    public ResponseEntity<Produto> post(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.saveProduto(produto));
    }

    @GetMapping
    public ResponseEntity<List<Produto>> getAll() {
        return ResponseEntity.ok(service.getProdutos());

    }

    @GetMapping("/{id}")
    public Produto getById(@PathVariable Long id) {
        return service.getProdutoById(id);

    }

    @DeleteMapping("/{id}")
    public Produto deleteById(@PathVariable Long id) {
        return service.deleteById(id);
    }


    @PutMapping
    public Produto put(@RequestBody Produto produto) {
        return service.updateProduto(produto);
    }
}
