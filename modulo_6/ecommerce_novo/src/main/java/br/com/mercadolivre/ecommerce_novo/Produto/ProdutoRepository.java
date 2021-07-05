package br.com.mercadolivre.ecommerce_novo.Produto;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class ProdutoRepository {

    public static List<Produto> produtos;

    public ProdutoRepository() {
        produtos = new ArrayList<>();
    }

    public Produto save(Produto produto) {
        produtos.add(produto);
        return produto;
    }

    public Produto encontrarPorId(Long id) {
        return produtos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean remove(Produto produto) {
        return produtos.remove(produto);
    }

    //public void remove(Long id) {
    //    produtos = produtos.stream().filter(p -> !p.getId().equals(id)).collect(Collectors.toList());
    //}
}
