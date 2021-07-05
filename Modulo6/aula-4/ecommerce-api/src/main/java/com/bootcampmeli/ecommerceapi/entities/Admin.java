package com.bootcampmeli.ecommerceapi.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Admin extends User {

    public Admin(){}

    public Admin(String username) {
        super(username);
    }

    public Admin(String username, List<Order> orders) {
        super(username, orders);
    }
}
