package br.com.meli.ecommerce.entity;

import br.com.meli.ecommerce.enumerator.Role;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private Role role;

    public Usuario(String nome, String cpf, String email, Role role) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.role = role;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean isAdministrador() {
        return this.role.equals(Role.ADMINISTRADOR);
    }
}
