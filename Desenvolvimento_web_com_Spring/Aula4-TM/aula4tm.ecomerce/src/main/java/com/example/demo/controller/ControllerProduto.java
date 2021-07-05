package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProdutoDTO;
import com.example.demo.entity.Produto;
import com.example.demo.service.ProdutoService;

@RestController
public class ControllerProduto {

	@Autowired
	ProdutoService produtoService;
	
	@GetMapping("/produto")
	public ResponseEntity<List<Produto>> getProdutos(){
		List<Produto> produtos = produtoService.getProdutos();
		return new ResponseEntity<List<Produto>>(produtos,HttpStatus.OK);
		
	}
	
	@GetMapping("/produto/categoria/{categoria}")
	public ResponseEntity<List<Produto>> getProdutosByCategoria(@PathVariable String categoria){
		List<Produto> produtos = produtoService.getProdutosByCategoria(categoria);
		return new ResponseEntity<List<Produto>>(produtos,HttpStatus.OK);
		
	}
	
	
	
}
