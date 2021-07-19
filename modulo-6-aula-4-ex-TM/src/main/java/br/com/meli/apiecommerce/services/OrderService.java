package br.com.meli.apiecommerce.services;

import br.com.meli.apiecommerce.dto.OrderDTO;
import br.com.meli.apiecommerce.dto.ProductDTO;
import br.com.meli.apiecommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    private int id = 1;

    public OrderDTO create(OrderDTO order) {
        order.setId(id);
        id++;

        BigDecimal orderTotal = BigDecimal.ZERO;

        for(ProductDTO product : order.getProducts()) {
            orderTotal = orderTotal.add(product.getPrice());
        }

        order.setTotal(orderTotal);

        orderRepository.add(order);
        return order;
    }
}
