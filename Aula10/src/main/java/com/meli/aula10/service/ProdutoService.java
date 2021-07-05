package com.meli.aula10.service;

import com.meli.aula10.domain.Produto;
import com.meli.aula10.domain.Usuario;
import com.meli.aula10.repository.ProdutoRepository;
import com.meli.aula10.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProdutoService {
    @Autowired
    UsuarioRepository repository;

    @Autowired
    ProdutoRepository produtoRepository;
    private boolean verificaAdm(int id){
        Usuario usuario = repository.findById(id);
        if(id == usuario.getId())
            return true;
        else
            return false;
    }

    public void addProduto(int id,Produto p){
        if (verificaAdm(id)){
            produtoRepository.addProduto(p);
        }
    }
    public void removeProduto(int id, int idProduto){
        if (verificaAdm(id)){
            produtoRepository.removeProduto(idProduto);
        }
    }
    public void editaProduto(int id, int produtoId, Produto p){
        if(verificaAdm(id)){
            produtoRepository.editProduto(produtoId, p);
        }
    }
}
