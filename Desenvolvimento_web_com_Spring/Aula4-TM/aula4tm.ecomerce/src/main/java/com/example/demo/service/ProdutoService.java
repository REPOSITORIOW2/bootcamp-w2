package com.example.demo.service;

import java.nio.file.AccessDeniedException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProdutoDTO;
import com.example.demo.entity.Categoria;
import com.example.demo.entity.Produto;
import com.example.demo.repository.ProdutosRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutosRepository produtoRepository;
	@Autowired
	private UsuarioService usuarioService;
	
	
	public long create(long userID,ProdutoDTO produtoDTO) throws AccessDeniedException {
		if(!usuarioService.getUsuario(userID).isAdmin()) {
			throw new AccessDeniedException("");
		}
		
		return produtoRepository.create(produtoDTO);
	}
	
	public List<Produto> getProdutos(){
		return produtoRepository.getProdutos();
	}

	public long update(long userID, Produto produto) throws AccessDeniedException {
		if(!usuarioService.getUsuario(userID).isAdmin()) {
			throw new AccessDeniedException("");
		}
		
		return produtoRepository.update(produto);
	}

	public void remove(long userID, long idProduto) throws AccessDeniedException {
		if(!usuarioService.getUsuario(userID).isAdmin()) {
			throw new AccessDeniedException("");
		}
		produtoRepository.remove(idProduto);
	}

	public List<Produto> getProdutosByCategoria(String categoria) {
		List<Produto> produtos = new ArrayList<Produto>();
		for(Produto p : produtoRepository.getProdutos()) {
			for(Categoria c : p.getCategorias()) {
				if(c.toString().equalsIgnoreCase(categoria)) {
					produtos.add(p);
				}
			}
		}
		
		return produtos;
	}
	
	
	

}
