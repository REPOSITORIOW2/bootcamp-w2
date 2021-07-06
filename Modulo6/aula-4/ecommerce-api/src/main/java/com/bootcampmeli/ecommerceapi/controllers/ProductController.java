package com.bootcampmeli.ecommerceapi.controllers;

import java.util.List;

import com.bootcampmeli.ecommerceapi.dtos.*;
import com.bootcampmeli.ecommerceapi.services.ProductService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("{productId}")
    public ProductDTO getProductById(@PathVariable Long productId) {
        ProductDTO productDto = null;
        try {
            productDto = this.productService.getProductById(productId);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return productDto;
    }

    @GetMapping("")
    public List<ProductDTO> getProducts(@RequestParam(required = false) List<Long> categories) {
        if(categories != null){
            return this.productService.getProductsByCategories(categories);
        }
        return this.productService.getProducts();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductDTO insertProduct(@RequestBody CreateProductDTO createProductDTO) {
        ProductDTO productDto = null;
        try {
            productDto = this.productService.insertProduct(createProductDTO);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

        return productDto;
    }

    @DeleteMapping("{productId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable Long productId, @RequestBody UserDTO userDto) {
        try {
            this.productService.deleteProduct(productId, userDto);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

    @PutMapping("{productId}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO putProduct(@PathVariable Long productId, @RequestBody UpdateProductDTO updateProductDTO) {
        ProductDTO product = null;
        try {
            product = this.productService.putProduct(productId, updateProductDTO);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

        return product;
    }
}
