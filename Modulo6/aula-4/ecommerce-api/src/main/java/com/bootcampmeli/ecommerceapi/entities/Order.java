package com.bootcampmeli.ecommerceapi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "\"ORDER\"")
public class Order {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<OrderItem> items = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private User user;

    public Order() {}

    public Order(User user) {
        this.user = user;
    }

    public Order(List<OrderItem> items) {
        this.items = items;
    }

    public Order(List<OrderItem> items, User user) {
        this.items = items;
        this.user = user;
    }

    public Long getId() {
        return this.id;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    public void setItems(List<OrderItem> items){
        this.items = items;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
