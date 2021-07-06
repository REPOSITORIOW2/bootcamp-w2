package com.bootcampmeli.ecommerceapi.controllers;

import com.bootcampmeli.ecommerceapi.dtos.ProductDTO;
import com.bootcampmeli.ecommerceapi.services.OrderService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.bootcampmeli.ecommerceapi.dtos.OrderDTO;
import com.bootcampmeli.ecommerceapi.dtos.CreateOrderDTO;

import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController {
    
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<OrderDTO> getOrders() {
        return this.orderService.getOrders();
    }

    @GetMapping("{orderId}")
    public OrderDTO getProductById(@PathVariable Long orderId) {
        OrderDTO orderDTO = null;
        try {
            orderDTO = this.orderService.getProductById(orderId);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return orderDTO;
    }

    @PostMapping
    public OrderDTO addOrder(@RequestBody CreateOrderDTO createOrderDto) {
        OrderDTO orderDto = null;
        try {
            orderDto = this.orderService.addOrder(createOrderDto);
        } catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }

        return orderDto;
    }
}
