package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.controllers;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto.ProductDTO;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.forms.ProductForm;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/addProduct")
    public ProductDTO addProduct(@RequestBody ProductForm produto){
        return service.addProduto(produto);
    }

    @DeleteMapping("/{idProduto}")
    public  addProduct(@PathVariable Long idProduto){
        service.deleteProduto(idProduto);
    }
}
