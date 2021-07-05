package br.com.meli.apiecommerce.services;

import br.com.meli.apiecommerce.dto.OrderDTO;
import br.com.meli.apiecommerce.dto.UserDTO;
import br.com.meli.apiecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    private int id = 1;

    public UserDTO create(UserDTO user) {
        user.setId(id);
        id++;

        userRepository.add(user);

        return user;
    }

    public void addOrder(int id, OrderDTO order) {
        userRepository.addOrder(id, order);
    }

    public UserDTO findById(int id) {
        return userRepository.findById(id);
    }
}
