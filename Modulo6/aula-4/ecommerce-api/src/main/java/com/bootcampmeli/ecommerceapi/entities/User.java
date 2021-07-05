package com.bootcampmeli.ecommerceapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Order> orders = new ArrayList<>();


    public User() {}

    public User(String username) {
        this.username = username;
    }

    public User(String username, List<Order> orders) {
        this.username = username;
        this.orders = orders;
    }

    public String getUsername() {
        return this.username;
    }
    
    public Long getId() {
        return this.id;
    }

    public void setOrders(List<Order> orders){
        this.orders = orders;
    }
        
}
