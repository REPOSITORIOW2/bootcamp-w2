package br.com.meli.ecommerce.controller;

import br.com.meli.ecommerce.dto.UsuarioDTO;
import br.com.meli.ecommerce.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService service;

    @Autowired
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioDTO> getUsuarios() {
        return UsuarioDTO.converter(service.getUsuarios());
    }

    @GetMapping("/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioDTO getUsuarioByCPF(@PathVariable String cpf) {
        return UsuarioDTO.converter(service.getUsuarioByCPF(cpf));
    }
}
