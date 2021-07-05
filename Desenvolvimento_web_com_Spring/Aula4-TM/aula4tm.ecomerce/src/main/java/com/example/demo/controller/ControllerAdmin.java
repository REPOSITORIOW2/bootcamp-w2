package com.example.demo.controller;

import java.net.URI;
import java.nio.file.AccessDeniedException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.dto.ProdutoDTO;
import com.example.demo.entity.Produto;
import com.example.demo.service.ProdutoService;
import com.example.demo.service.UsuarioService;

@RestController
@RequestMapping("/admin")
public class ControllerAdmin {

	@Autowired
	private ProdutoService produtoService;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("/{id}/criaproduto")
	public ResponseEntity<Long> cadastraProduto(@RequestBody ProdutoDTO produtoDTO, @PathVariable long id,UriComponentsBuilder uriBuilder) {
		try {
			long produtoId = produtoService.create(id,produtoDTO);			
			URI uri = uriBuilder.path("/produto/{id}").buildAndExpand(produtoId).toUri();
			return ResponseEntity.created(uri).build();
		}
		catch(AccessDeniedException e){
			return new ResponseEntity<Long>(HttpStatus.FORBIDDEN);
		}
	}
	
	@PutMapping("/{id}/alteraproduto/")
	public ResponseEntity<Long> alteraProduto(@RequestBody Produto produto, @PathVariable long id,UriComponentsBuilder uriBuilder) {
		try {
			long produtoId = produtoService.update(id,produto);			
			URI uri = uriBuilder.path("/produto/{id}").buildAndExpand(produtoId).toUri();
			return ResponseEntity.created(uri).build();
		}
		catch(AccessDeniedException e){
			return new ResponseEntity<Long>(HttpStatus.FORBIDDEN);
		}
	}
	
	@DeleteMapping("/{id}/deletaproduto/{idProduto}")
	public ResponseEntity<Long> deletaProduto(@PathVariable long id,@PathVariable long idProduto) {
		try {
			produtoService.remove(id,idProduto);
			return new ResponseEntity<Long>(HttpStatus.OK);

		}
		catch(AccessDeniedException e){
			return new ResponseEntity<Long>(HttpStatus.FORBIDDEN);
		}
	}
	
	
}
