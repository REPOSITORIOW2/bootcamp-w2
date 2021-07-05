package com.bootcampmeli.ecommerceapi.dtos;

import java.util.List;
import java.util.stream.Collectors;

import com.bootcampmeli.ecommerceapi.entities.Order;

public class OrderDTO {
    
    private Long userId;
    private List<OrderItemDTO> items;

    public OrderDTO(){}

    public OrderDTO(Long userId, List<OrderItemDTO> items) {
        this.setUserId(userId);
        this.setItems(items);
    }

    public List<OrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<OrderItemDTO> items) {
        this.items = items;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

	public static OrderDTO toDTO(Order order) {
        List<OrderItemDTO> orderItems = order.getItems()
            .stream()
            .map(oi -> OrderItemDTO.toDTO(oi))
            .collect(Collectors.toList());
        return new OrderDTO(order.getUser().getId(), orderItems);
    }

}
