package com.bootcampmeli.ecommerceapi.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "products", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Category> categories = new ArrayList<>();

    private BigDecimal price;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<OrderItem> orderItems = new ArrayList<>();

    public Product() {}

    public Product(String name, List<OrderItem> orderItems, BigDecimal price) {
        this.name = name;
        this.orderItems = orderItems;
        this.price = price;
    }

    public Product(String name, BigDecimal price, List<Category> categories) {
        this.name = name;
        this.price = price;
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Long getId() {
        return id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

}
