package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProdutoDTO;
import com.example.demo.entity.Produto;

@Repository
public class ProdutosRepository {

	private static List<Produto> produtos = new ArrayList<Produto>();
	
	
	public long create(ProdutoDTO produtoDTO) {
		Produto produto = new Produto(produtos.size()+1, produtoDTO.getNome(), produtoDTO.getValor(), produtoDTO.getCategorias());
		produtos.add(produto);
		return produto.getId();
	}
	
	public List<Produto> getProdutos(){
		return produtos;
	}

	public long update(Produto produto) {
		for(Produto p : produtos) {
			if(p.getId()==produto.getId()){
				p.setNome(produto.getNome());
				p.setValor(produto.getValor());
				p.setCategorias(produto.getCategorias());
				return p.getId();
			}
		}
		return 0;
	}

	public void remove(long idProduto) {
		Produto produto = null;
		for(Produto p : produtos) {
			if(p.getId()==idProduto) {
				produto = p;
				break;
			}
		}
		produtos.remove(produto);
	}
	
	public Produto get(long idProduto) {
		for(Produto p : produtos) {
			if(p.getId()==idProduto) {
				return p;
			}
		}
		return null;
	}
	
}
