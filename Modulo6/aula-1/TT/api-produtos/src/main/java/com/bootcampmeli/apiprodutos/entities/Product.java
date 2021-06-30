package com.bootcampmeli.apiprodutos.entities;

import java.math.BigDecimal;

public class Product {

    public Product() { }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    private String name;
    private BigDecimal price;
    
}
