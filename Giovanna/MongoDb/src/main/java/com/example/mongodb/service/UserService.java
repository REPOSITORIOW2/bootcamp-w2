package com.example.mongodb.service;


import com.example.mongodb.model.User;
import com.example.mongodb.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {
    private final
    UserRepository userRepository;

    public User addUser(User User) {
        return userRepository.insert(User);
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(User User) {
        return userRepository.insert(User);
    }

    public void deleteUserById(String id) {
        userRepository.deleteById(id);
    }
}