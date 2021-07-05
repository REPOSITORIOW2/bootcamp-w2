package com.bootcampmeli.ecommerceapi.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Customer extends User {

    public Customer(){}

    public Customer(String username) {
        super(username);
    }

    public Customer(String username, List<Order> orders) {
        super(username, orders);
    }
}
