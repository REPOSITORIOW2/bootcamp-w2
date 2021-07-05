package com.bootcampmeli.ecommerceapi.services;

import java.util.ArrayList;
import java.util.List;

import com.bootcampmeli.ecommerceapi.dtos.CreateOrderDTO;
import com.bootcampmeli.ecommerceapi.dtos.CreateOrderItemDTO;
import com.bootcampmeli.ecommerceapi.dtos.OrderDTO;
import com.bootcampmeli.ecommerceapi.entities.Order;
import com.bootcampmeli.ecommerceapi.entities.OrderItem;
import com.bootcampmeli.ecommerceapi.entities.Product;
import com.bootcampmeli.ecommerceapi.entities.User;
import com.bootcampmeli.ecommerceapi.repositories.ICategoryRepository;
import com.bootcampmeli.ecommerceapi.repositories.IOrderRepository;
import com.bootcampmeli.ecommerceapi.repositories.IProductRepository;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final IOrderRepository orderRepository;
    private final ICategoryRepository categoryRepository;
    private final IProductRepository productRepository;
    private final UserService userService;


    public OrderService(
            IOrderRepository orderRepository,
            ICategoryRepository categoryRepository, 
            IProductRepository productRepository, 
            UserService userService) {
        this.orderRepository = orderRepository;
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.userService = userService;
    }

    public OrderDTO addOrder(CreateOrderDTO createOrderDto) {
        User user = userService.findById(createOrderDto.getUserId());

        List<OrderItem> orderItems = new ArrayList<>();

        for(CreateOrderItemDTO createOrderItemDto : createOrderDto.getOrderItems()){
            Long productId = createOrderItemDto.getProductId();
            Product product = this.productRepository.findById(productId).orElseThrow(() ->
                new RuntimeException("The prooduct with id " + productId  + " does not exist.")
            );
            OrderItem orderItem = new OrderItem(product, createOrderItemDto.getQuantity());
            orderItems.add(orderItem);
        }
        
        Order order = new Order(orderItems, user);
        Order newOrder = orderRepository.save(order);
        
        return OrderDTO.toDTO(newOrder);
    }
    
}
