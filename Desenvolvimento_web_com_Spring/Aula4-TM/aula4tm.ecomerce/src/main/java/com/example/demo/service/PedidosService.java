package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pedido;
import com.example.demo.entity.Produto;
import com.example.demo.repository.PedidosRepository;
import com.example.demo.repository.ProdutosRepository;
import com.example.demo.repository.UsuarioRepository;

@Service
public class PedidosService {

	@Autowired
	ProdutosRepository produtoRepository;
	@Autowired
	PedidosRepository pedidosRepository;
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public void addCarrinho(long idUsuario, List<Long> idProdutos) {
		List<Produto> produtos = new ArrayList<>();
		for(long p : idProdutos) {
			produtos.add(produtoRepository.get(p));
		}
		pedidosRepository.addCarrinho(usuarioRepository.getUsuario(idUsuario), produtos);
	}
	
	public List<Pedido> listPedidos(){
		return pedidosRepository.listPedidos();
	}

	public List<Pedido> getPedidos(long id) {
		// TODO Auto-generated method stub
		return pedidosRepository.listPedidos().stream().filter(p -> p.getUsuario().getId()==id).collect(Collectors.toList());
	}
}
