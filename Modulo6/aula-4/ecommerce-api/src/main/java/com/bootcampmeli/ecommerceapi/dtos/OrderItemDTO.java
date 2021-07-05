package com.bootcampmeli.ecommerceapi.dtos;

import com.bootcampmeli.ecommerceapi.entities.OrderItem;

public class OrderItemDTO {
    
    private ProductDTO product;
    private Integer quantity;

    public OrderItemDTO() {}

    public OrderItemDTO(ProductDTO product, Integer quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public ProductDTO getProduct() {
        return this.product;
    }

    public static OrderItemDTO toDTO(OrderItem orderItem){
        return new OrderItemDTO(ProductDTO.toDTO(orderItem.getProduct()), orderItem.getQuantity());
    }

}
