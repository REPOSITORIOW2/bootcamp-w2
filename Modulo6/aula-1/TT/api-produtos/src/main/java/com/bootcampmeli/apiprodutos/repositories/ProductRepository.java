package com.bootcampmeli.apiprodutos.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bootcampmeli.apiprodutos.entities.Product;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {
    public Map<Long, Product> products;
    private static Long autoIncrementId = 0L;

    public ProductRepository() {
        this.products = new HashMap<>();
    }

    public List<Product> getProducts() {
        return new ArrayList<Product>(products.values());
    }

    public Product getProduct(long id) throws RuntimeException {
        if (!this.products.containsKey(id)) {
            throw new RuntimeException("O produto não existe!");
        }
        return this.products.get(id);
    }

    public Product addProduct(Product product) {
        this.products.put(autoIncrementId, product);
        return this.products.get(autoIncrementId++);
    }

    public Product putProduct(long id, Product product) throws RuntimeException {
        if (!this.products.containsKey(id)) {
            throw new RuntimeException("O produto não existe!");
        }

        Product p = this.products.get(id);
        p.setName(product.getName());
        p.setPrice(product.getPrice());
        
        this.products.put(id, p);
        return this.products.get(id);
    }

    public void removeProduct(Long id) throws RuntimeException {
        if (!this.products.containsKey(id)) {
            throw new RuntimeException("Produto com " + id + " não existe!");
        }
        this.products.remove(id);
    }
}
    