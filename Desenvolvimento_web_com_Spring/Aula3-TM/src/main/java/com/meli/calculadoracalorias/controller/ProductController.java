package com.meli.calculadoracalorias.controller;

import com.meli.calculadoracalorias.entity.Product;
import com.meli.calculadoracalorias.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<Product>> listaProdutos() {
        return new ResponseEntity<>(productService.getList(), HttpStatus.OK);
    }

}
