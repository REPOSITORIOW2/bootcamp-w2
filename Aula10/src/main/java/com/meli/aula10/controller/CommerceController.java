package com.meli.aula10.controller;

import com.meli.aula10.domain.Pedido;
import com.meli.aula10.domain.Produto;
import com.meli.aula10.repository.ProdutoRepository;
import com.meli.aula10.repository.UsuarioRepository;
import com.meli.aula10.service.ProdutoService;
import com.meli.aula10.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    ProdutoService produtoService;

    @RequestMapping(value = "/pedido/{clientId}", method = RequestMethod.POST)
    public void addPedido(@PathVariable int clientId, @RequestBody Pedido pedido){
        usuarioService.addPedido(clientId, pedido);
    }

    //ADMIN

    @RequestMapping(value = "/add-produto/adm/{admId}", method = RequestMethod.POST)
    public void addProduto(@PathVariable int admId, @RequestBody Produto produto){
        produtoService.addProduto(admId, produto);
    }

    @RequestMapping(value = "/edit-produto/{idProduto}/adm/{admId}", method = RequestMethod.PUT)
    public void editProduto(@PathVariable int admId, @PathVariable int idProduto, @RequestBody Produto produto){
        produtoService.editaProduto(admId, idProduto, produto);
    }

    @RequestMapping(value = "/delete-produto/{idProduto}/adm/{admId}", method = RequestMethod.DELETE)
    public void deleteProduto(@PathVariable int admId, @PathVariable int idProduto){
        produtoService.removeProduto(admId, idProduto);
    }
}
