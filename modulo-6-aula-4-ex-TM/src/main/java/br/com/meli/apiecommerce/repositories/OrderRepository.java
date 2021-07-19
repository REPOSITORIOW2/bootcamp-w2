package br.com.meli.apiecommerce.repositories;

import br.com.meli.apiecommerce.dto.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    private List<OrderDTO> orders = new ArrayList<>();

    public void add(OrderDTO order) {
        orders.add(order);
    }
}
