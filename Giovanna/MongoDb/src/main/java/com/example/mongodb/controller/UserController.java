package com.example.mongodb.controller;

import com.bootcamp.demo.model.User;
import com.bootcamp.demo.service.UserService;
import com.example.mongodb.model.User;
import com.example.mongodb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User User){
        return userService.addUser(User);
    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.listAllUsers();
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User User){
        return userService.updateUser(User);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@RequestParam Long id){
        userService.deleteUserById(id);
    }
}