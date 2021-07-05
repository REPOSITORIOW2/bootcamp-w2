package com.bootcampmeli.ecommerceapi.repositories;

import com.bootcampmeli.ecommerceapi.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    
}
