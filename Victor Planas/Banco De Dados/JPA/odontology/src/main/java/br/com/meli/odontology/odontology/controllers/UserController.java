package br.com.meli.odontology.odontology.controllers;

import br.com.meli.odontology.odontology.entities.User;
import br.com.meli.odontology.odontology.forms.UserForm;
import br.com.meli.odontology.odontology.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody UserForm User){
        return userService.addUser(User);
    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.listAllUsers();
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody UserForm User){
        return userService.updateUser(User);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUserById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}
