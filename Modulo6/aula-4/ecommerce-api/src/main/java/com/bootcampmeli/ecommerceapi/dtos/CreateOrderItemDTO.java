package com.bootcampmeli.ecommerceapi.dtos;

public class CreateOrderItemDTO {

    private Long productId;
    private Integer quantity;

    public CreateOrderItemDTO(){}

    public CreateOrderItemDTO(Long productId, Integer quantity){
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }
    
    public Integer getQuantity() {
        return this.quantity;
    } 
}
