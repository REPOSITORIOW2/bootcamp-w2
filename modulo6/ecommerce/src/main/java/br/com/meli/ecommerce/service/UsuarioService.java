package br.com.meli.ecommerce.service;

import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public void addUsuario(Usuario usuario) {
        repository.adicionar(usuario);
    }

    public Usuario getUsuarioByCPF(String cpf) {
        return repository.getByCpf(cpf);
    }

    public List<Usuario> getUsuarios() {
        return repository.getList();
    }
}
