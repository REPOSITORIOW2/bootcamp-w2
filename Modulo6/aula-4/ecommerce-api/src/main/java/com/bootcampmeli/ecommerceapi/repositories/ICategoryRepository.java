package com.bootcampmeli.ecommerceapi.repositories;

import com.bootcampmeli.ecommerceapi.entities.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
    
}
