package br.com.meli.ecommerce.dto;

import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.enumerator.Role;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioDTO {
    private String nome;
    private String email;

    public UsuarioDTO(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public UsuarioDTO(Usuario usuario) {
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static UsuarioDTO converter(Usuario usuario) {
        return new UsuarioDTO(usuario);
    }

    public static List<UsuarioDTO> converter(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(UsuarioDTO::new)
                .collect(Collectors.toList());
    }
}
