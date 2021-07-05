package com.meli.aula10.controller;

import com.meli.aula10.domain.Pedido;
import com.meli.aula10.domain.Produto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commerce")
public class CommerceController {

    @RequestMapping(value = "/pedido/{clientId}", method = RequestMethod.POST)
    public void addPedido(@PathVariable int clientId, @RequestBody Pedido pedido){

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
