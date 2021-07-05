package com.bootcampmeli.ecommerceapi.repositories;

import com.bootcampmeli.ecommerceapi.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order, Long> {
    
}
