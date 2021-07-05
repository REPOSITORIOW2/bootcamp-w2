package br.com.meli.ecommerce.service;

import br.com.meli.ecommerce.entity.Produto;
import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    @Autowired
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public void addProduto(Usuario usuario, Produto produto) {
        if (!usuario.isAdministrador()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED, "Usuário não é um administrador.");
        } else {
            repository.adicionar(produto);
        }
    }

    public void removerProduto(Usuario usuario, String codigo) {
        if (!usuario.isAdministrador()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED, "Usuário não é um administrador.");
        } else {
            repository.remover(codigo);
        }
    }

    public List<Produto> getProdutos() {
        return repository.getList();
    }

    public Produto getProdutoByCodigo(String codigo) {
        return repository.getByCodigo(codigo);
    }

    public List<Produto> getProdutosByCategoria(String categoria) {
        return repository.getList()
                .stream()
                .filter(p -> p.getCategorias().contains(categoria))
                .collect(Collectors.toList());
    }

    public void alterarProduto(Usuario usuario, String codigo, Produto produtoAlterar) {
        if (!usuario.isAdministrador()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED, "Usuário não é um administrador.");
        } else {
            repository.alterar(codigo, produtoAlterar);
        }
    }
}
