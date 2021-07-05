package br.com.meli.ecommerce.repository;

import br.com.meli.ecommerce.entity.Produto;
import org.springframework.stereotype.Repository;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Repository
public class ProdutoRepository {

    private static final List<Produto> produtos = new ArrayList<Produto>(
            Arrays.asList(
                    new Produto("PROD-01", "PS5", 5000.00, List.of("Eletrônicos", "Video-games")),
                    new Produto("PROD-02", "XBOX", 4500.00, List.of("Eletrônicos", "Video-games")),
                    new Produto("PROD-03", "Calça de moletom", 99.00, List.of("Roupas"))
            )
    );

    public void adicionar(Produto produto) {
        Optional<Produto> produtoOptional = produtos.stream()
                .filter(p -> p.getCodigo().equals(produto.getCodigo()))
                .findFirst();

        if (produtoOptional.isEmpty()) {
            produtos.add(produto);
        } else {
            throw new KeyAlreadyExistsException("Código de produto duplicado.");
        }
    }

    public void remover(String codigo) {
        produtos.remove(this.getByCodigo(codigo));
    }

    public List<Produto> getList() {
        return produtos;
    }

    public Produto getByCodigo(String codigo) {
        return produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Produto " + codigo + " não encontrado."));
    }

    public void alterar(String codigo, Produto produtoAlterar) {
        Optional<Produto> produtoOptional = produtos.stream()
                .filter(p -> p.getCodigo().equals(codigo))
                .findFirst();

        if (produtoOptional.isPresent()) {
            Produto produto = produtoOptional.get();

            produto.setDescricao(produtoAlterar.getDescricao());
            produto.setPreco(produtoAlterar.getPreco());
            produto.setCategorias(produtoAlterar.getCategorias());
        } else {
            this.adicionar(produtoAlterar);
        }
    }
}
