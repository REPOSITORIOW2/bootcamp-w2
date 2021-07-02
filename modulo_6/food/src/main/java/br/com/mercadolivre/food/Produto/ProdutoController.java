package br.com.mercadolivre.food.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@RestController
public class ProdutoController {

    private final ProdutoService produtoService;

    @Autowired
    public ProdutoController(ProdutoService produtoService) {

        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> getAllFood() {

        return produtoService.getAll();
    }

    @GetMapping("/{name}")
    public Produto getSpecificFood(@PathVariable String name){

        return produtoService.getSpecificFood(name);
    }

}
