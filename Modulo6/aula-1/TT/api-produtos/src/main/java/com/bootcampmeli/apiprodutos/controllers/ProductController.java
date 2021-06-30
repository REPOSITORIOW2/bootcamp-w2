package com.bootcampmeli.apiprodutos.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

import com.bootcampmeli.apiprodutos.entities.Product;
import com.bootcampmeli.apiprodutos.services.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Product> getProducts() {
        return this.productService.getProducts();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Product getProduct(@PathVariable long id) {
        Product product = null;
        try {
            product = this.productService.getProduct(id);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return product;
    }

    @PostMapping    
    @ResponseStatus(code = HttpStatus.CREATED)
    public Product addProduct(@RequestBody Product product) {
        return this.productService.addProduct(product);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Product putProduct(@PathVariable long id, @RequestBody Product product)  {
        Product p = null;
        try {
            p = this.productService.putProduct(id, product);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return p;
    }
    
    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void removeProduct(@PathVariable long id) {
        try {
            this.productService.removeProduct(id);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
