package com.meli.aula10.controller;

import com.meli.aula10.domain.Pedido;
import com.meli.aula10.domain.Produto;
import com.meli.aula10.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

    @Autowired
    UsuarioRepository usarioRepository;

    @RequestMapping(value = "/pedido/{clientId}", method = RequestMethod.POST)
    public void addPedido(@PathVariable int clientId, @RequestBody Pedido pedido){

    }

    @RequestMapping(value = "/pedido", method = RequestMethod.GET)
    public void addPedido(){
        System.out.println(usarioRepository.getUsaurios());
    }


    //ADMIN

    @RequestMapping(value = "/add-produto", method = RequestMethod.POST)
    public void addProduto(@RequestBody Produto produto){

    }

    @RequestMapping(value = "/edit-produto/{idProduto}", method = RequestMethod.PUT)
    public void editProduto(@PathVariable int idProduto, @RequestBody Produto produto){

    }

    @RequestMapping(value = "/delete-produto/{idProduto}", method = RequestMethod.DELETE)
    public void deleteProduto(@PathVariable int idProduto){

    }
}
