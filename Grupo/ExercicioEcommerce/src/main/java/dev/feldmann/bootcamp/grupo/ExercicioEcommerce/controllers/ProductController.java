package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.controllers;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto.GenericResponseDTO;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.dto.ProductDTO;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.forms.ProductForm;
import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/")
    public ProductDTO addProduct(@RequestBody ProductForm produto){
        return service.addProduto(produto);
    }

    @DeleteMapping("/{idProduto}")
    public GenericResponseDTO deleteProduct(@PathVariable Long idProduto){
        service.deleteProduto(idProduto);
        return new GenericResponseDTO("Produto deletado com sucesso!", true);
    }

    @GetMapping("/{idProduto}")
    public ProductDTO getProduct(@PathVariable Long idProduto){
        return service.getInfoProduto(idProduto);
    }

    @PutMapping("/{idProduto}")
    public ProductDTO updateProduct(@RequestBody ProductForm produto, @PathVariable Long idProduto){
        return service.updateProduto(produto, idProduto);
    }

    @GetMapping("/")
    public List<ProductDTO> listProduct(){
        return service.listaProduto();
    }
}
