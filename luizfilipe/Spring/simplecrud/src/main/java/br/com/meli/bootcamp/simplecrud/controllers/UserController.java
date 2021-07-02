package br.com.meli.bootcamp.simplecrud.controllers;

import br.com.meli.bootcamp.simplecrud.services.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private User listuser;

    @PostMapping("/create")
    public ResponseEntity<Pessoa> create(@RequestBody Pessoa user) {
        System.out.println("Entreiiii");
        var retorno = listuser.create(user);
        return ResponseEntity.ok().body(retorno);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pessoa> read(@PathVariable Integer id) {
        var retorno = listuser.read(id);
        return ResponseEntity.ok().body(retorno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pessoa> update(@PathVariable Integer id, @RequestBody Pessoa user) {
        var retorno = listuser.update(id, user);
        return ResponseEntity.ok().body(retorno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pessoa> delete(@PathVariable Integer id) {
        var retorno = listuser.delete(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(retorno);
    }
}
