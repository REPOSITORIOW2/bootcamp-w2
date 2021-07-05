package com.bootcampmeli.ecommerceapi.services;

import com.bootcampmeli.ecommerceapi.entities.Admin;
import com.bootcampmeli.ecommerceapi.entities.User;
import com.bootcampmeli.ecommerceapi.repositories.IUserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean hasPermission(User user) {
        return isAdmin(user);
    }

    public boolean isAdmin(User user) {
        return (user instanceof Admin);
    }
    
    public User findById(Long userId) throws RuntimeException {
        return this.userRepository.findById(userId).orElseThrow(() ->
            new RuntimeException("The user with id " + userId + "doesn't exist.")
        );
    }
}
