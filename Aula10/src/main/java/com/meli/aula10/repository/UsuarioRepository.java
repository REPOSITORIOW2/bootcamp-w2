package com.meli.aula10.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.aula10.domain.Cliente;
import com.meli.aula10.domain.Pedido;
import com.meli.aula10.domain.Usuario;
import com.meli.aula10.domain.enums.TipoUsuario;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class UsuarioRepository {
    private static final String USUARIOS_JSON_FILE = "usuarios.json";
    private List<Usuario> listaUsuarios;

    public UsuarioRepository() {
        this.listaUsuarios = this.findAll();
    }

    private File getJson(String fileName) throws FileNotFoundException {
        File file = null;
        file = ResourceUtils.getFile("classpath:" + fileName);
        return file;
    }

    private List<Usuario> getUsuarios() {
        List<Usuario> usuarios = null;
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Usuario>> typeRef = new TypeReference<>() {
            };
            usuarios = mapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public List<Usuario> findAll() {
        return this.getUsuarios();
    }

    public Usuario findById(int id){
        return this.listaUsuarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
    }

    public void addPedido(int idUsuario, Pedido pedido) {
        Cliente usuario = (Cliente) findById(idUsuario);
        //usuario.setTipoUsuario(TipoUsuario.CLIENTE);
        usuario.addPedido(pedido);
        try {
            File file = this.getJson(USUARIOS_JSON_FILE);
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, this.listaUsuarios);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
