package com.bootcamp.demo.service;

import com.bootcamp.demo.model.User;
import com.bootcamp.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(User User) {
        return userRepository.save(User);
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User User) {
        return userRepository.save(User);
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}