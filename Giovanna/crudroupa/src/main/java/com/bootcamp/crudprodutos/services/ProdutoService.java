package com.bootcamp.crudprodutos.services;

import com.bootcamp.crudprodutos.models.Produto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ProdutoService {
    static HashMap<Long, Produto> produtos = new HashMap<Long, Produto>();
    private static long proximoId = 1;

    public Produto saveProduto(Produto produto) {
        if(produto.getId() == null || produto.getId() == 0){
            produto.setId(getNextId());
        }
        return produtos.put(produto.getId(),produto);
    }

    private long getNextId(){
        proximoId++;
        return proximoId-1;
    }
    public List<Produto> getProdutos() {
        return new ArrayList<Produto>(produtos.values());
    }

    public Produto getProdutoById(Long id) {
        return produtos.get(id);
    }

    public Produto deleteById(Long id) {
        produtos.remove(id);
        System.out.println("Produto apagado com sucesso.");
        return null;
    }

    public Produto updateProduto(Produto produto) {
        Produto produtoAlterado = produtos.get(produto.getId());

        if (produtoAlterado != null) {

            produtoAlterado.setNome(produto.getNome());
            produtoAlterado.setDescricao(produto.getDescricao());
            produtoAlterado.setValor(produto.getValor());
        }
        deleteById(produtoAlterado.getId());
        saveProduto(produtoAlterado);
        return produtoAlterado;
    }

}
