package br.com.meli.odontology.services;



import br.com.meli.odontology.entities.User;
import br.com.meli.odontology.forms.UserForm;
import br.com.meli.odontology.repositories.UserMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMongoRepository userMongoRepository;

    public User addUser(UserForm User) {
        return userMongoRepository.save(convertForm(User));
    }

    public List<User> listAllUsers() {
        return userMongoRepository.findAll();
    }

    public User updateUser(UserForm User) {
        return userMongoRepository.save(convertForm(User));
    }

    public void deleteUserById(String id) {
        userMongoRepository.deleteById(id);
    }

    private User convertForm(UserForm form){
        return new User(form.getUserName(), form.getPassword(),form.getUserStatus());
    }
}
