package com.bootcampmeli.apiprodutos.services;

import java.util.List;

import com.bootcampmeli.apiprodutos.entities.Product;
import com.bootcampmeli.apiprodutos.repositories.ProductRepository;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProduct(long id) throws RuntimeException {
        return this.productRepository.getProduct(id);
    }

    public List<Product> getProducts() {
        return this.productRepository.getProducts();
    }

    public Product addProduct(Product product) {
        return this.productRepository.addProduct(product);
    }

    public Product putProduct(long id, Product product) throws RuntimeException {
        return this.productRepository.putProduct(id, product);
    }

    public void removeProduct(Long id) throws RuntimeException {
        this.productRepository.removeProduct(id);
    }
}
