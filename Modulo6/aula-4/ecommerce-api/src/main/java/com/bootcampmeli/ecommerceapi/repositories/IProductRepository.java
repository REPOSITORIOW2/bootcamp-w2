package com.bootcampmeli.ecommerceapi.repositories;

import com.bootcampmeli.ecommerceapi.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository<Product, Long> {
    
}
