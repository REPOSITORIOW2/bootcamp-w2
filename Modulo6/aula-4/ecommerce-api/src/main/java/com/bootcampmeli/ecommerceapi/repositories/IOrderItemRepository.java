package com.bootcampmeli.ecommerceapi.repositories;

import com.bootcampmeli.ecommerceapi.entities.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderItemRepository extends JpaRepository<OrderItem, Long> {
    
}
