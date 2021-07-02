package com.meli.calculadoracalorias.service;

import com.meli.calculadoracalorias.entity.Product;
import com.meli.calculadoracalorias.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getList() {
        return productRepository.getList();
    }

}
