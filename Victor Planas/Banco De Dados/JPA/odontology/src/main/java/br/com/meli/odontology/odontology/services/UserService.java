package br.com.meli.odontology.odontology.services;

import br.com.meli.odontology.odontology.entities.User;
import br.com.meli.odontology.odontology.forms.UserForm;
import br.com.meli.odontology.odontology.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User addUser(UserForm User) {
        return userRepository.save(convertForm(User));
    }

    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User updateUser(UserForm User) {
        return userRepository.save(convertForm(User));
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

    private User convertForm(UserForm form){
        return new User(form.getUserName(), form.getPassword(),form.getUserStatus());
    }
}
