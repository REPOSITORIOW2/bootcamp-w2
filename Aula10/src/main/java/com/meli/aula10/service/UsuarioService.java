package com.meli.aula10.service;

import com.meli.aula10.domain.Pedido;
import com.meli.aula10.domain.Usuario;
import com.meli.aula10.domain.enums.TipoUsuario;
import com.meli.aula10.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    private boolean verificaCliente(int id){
        Usuario usuario = usuarioRepository.findById(id);
        if(usuario.getTipoUsuario() == TipoUsuario.CLIENTE)
            return true;
        else
            return false;
    }

    public void addPedido(int id, Pedido p){
        if (verificaCliente(id)){
            usuarioRepository.addPedido(id, p);
        }
    }
}
