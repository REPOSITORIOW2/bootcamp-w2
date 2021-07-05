package com.bootcampmeli.ecommerceapi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Product product;

    private Integer quantity;

    @ManyToOne
    @JoinColumn
    private Order order;


    public OrderItem() {}

    public OrderItem(Order order, Integer quantity) {
        this.order = order;
        this.quantity = quantity;
    }

    public OrderItem(Product product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Long getId() {
        return this.id;
    }

    public Product getProduct() {
        return this.product;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

}
