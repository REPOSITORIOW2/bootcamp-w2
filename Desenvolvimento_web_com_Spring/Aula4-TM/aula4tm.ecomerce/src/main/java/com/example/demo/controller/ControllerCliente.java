package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.entity.Pedido;
import com.example.demo.service.PedidosService;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/cliente")
public class ControllerCliente {

	@Autowired
	PedidosService pedidoService;
	
	@PostMapping("/addcarrinho/{id}")
	public ResponseEntity<Pedido> addCarrinho(@PathVariable long id, @RequestBody List<Long> idProdutos, UriComponentsBuilder uriBuilder){
		pedidoService.addCarrinho(id,idProdutos);
		URI uri = uriBuilder.path("/pedido/{id}").buildAndExpand(id).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@GetMapping("/{id}/pedidos")
	public List<Pedido> getPedido(@PathVariable long id){
		return pedidoService.getPedidos(id);
	}
	
}
