package br.com.meli.apiecommerce.repositories;

import br.com.meli.apiecommerce.dto.OrderDTO;
import br.com.meli.apiecommerce.dto.UserDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<UserDTO> users = new ArrayList<>();

    public void add(UserDTO user) {
        users.add(user);
    }

    public void addOrder(int id, OrderDTO order) {
        UserDTO user = findById(id);
        if(user == null) return;

        List<OrderDTO> updatedOrders = user.getOrders();
        updatedOrders.add(order);

        user.setOrders(updatedOrders);
    }

    public UserDTO findById(int id) {
        for(UserDTO user : users) {
            if(user.getId() == id) return user;
        }

        return null;
    }
}
