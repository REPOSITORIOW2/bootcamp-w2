package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Pedido;
import com.example.demo.entity.Produto;
import com.example.demo.entity.Usuario;

@Repository
public class PedidosRepository {

	private static List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public void addCarrinho(Usuario usuario, List<Produto> produtos) {
		pedidos.add(new Pedido(pedidos.size()+1, "Pedido " + pedidos.size()+1, usuario, produtos));
	}
	
	public List<Pedido> listPedidos(){
		return pedidos;
	}
	
	
}
