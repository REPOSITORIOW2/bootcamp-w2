package com.bootcampmeli.ecommerceapi.controllers;

import com.bootcampmeli.ecommerceapi.services.OrderService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.bootcampmeli.ecommerceapi.dtos.OrderDTO;
import com.bootcampmeli.ecommerceapi.dtos.CreateOrderDTO;

@RestController
@RequestMapping("orders")
public class OrderController {
    
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
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
