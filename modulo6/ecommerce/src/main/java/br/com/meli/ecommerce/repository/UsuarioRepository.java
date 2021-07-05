package br.com.meli.ecommerce.repository;

import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.enumerator.Role;
import org.springframework.stereotype.Repository;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class UsuarioRepository {

    private static final List<Usuario> usuarios = new ArrayList<Usuario>(
            Arrays.asList(
                    new Usuario("Arthur Massaini", "123.456.789-10", "arthur@mercadolivre.com", Role.ADMINISTRADOR),
                    new Usuario("Caio Max", "109.876.543-21", "caio@mercadolivre.com", Role.ADMINISTRADOR),
                    new Usuario("Igor Ventorim", "111.111.111-11", "igor@mercadolivre.com", Role.CLIENTE),
                    new Usuario("João Pedro", "222.222.222-22", "joao@mercadolivre.com", Role.CLIENTE),
                    new Usuario("Vitor Vasconcellos", "555.555.555-55", "vitor@mercadolivre.com", Role.CLIENTE)
            )
    );

    public List<Usuario> getList() {
        return usuarios;
    }

    public void adicionar(Usuario usuario) {
        Optional<Usuario> usuarioOptional = usuarios.stream()
                .filter(u -> u.getCpf().equals(usuario.getCpf()))
                .findFirst();

        if (usuarioOptional.isEmpty()) {
            usuarios.add(usuario);
        } else {
            throw new KeyAlreadyExistsException("CPF do usuário duplicado.");
        }
    }

    public void remover(String cpf) {
        usuarios.remove(this.getByCpf(cpf));
    }

    public Usuario getByCpf(String cpf) {
        return usuarios.stream()
                .filter(u -> u.getCpf().equals(cpf))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Usuário de CPF " + cpf + " não encontrado."));
    }

}
