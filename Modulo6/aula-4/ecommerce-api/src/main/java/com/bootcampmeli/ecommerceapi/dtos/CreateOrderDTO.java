package com.bootcampmeli.ecommerceapi.dtos;

import java.util.List;

public class CreateOrderDTO {

    private Long userId;
    private List<CreateOrderItemDTO> orderItems;

    public CreateOrderDTO() {}

    public CreateOrderDTO(Long userId, List<CreateOrderItemDTO> orderItems) {
        this.userId = userId;
        this.orderItems = orderItems;
    }

    public Long getUserId() {
        return this.userId;
    }

    public List<CreateOrderItemDTO> getOrderItems(){
        return this.orderItems;
    }
    
}
