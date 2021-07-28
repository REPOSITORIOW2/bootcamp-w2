package br.com.meli.aula1spring.tarde;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ProdutoService {
    private int posicaoID = 0;
    private Map<Integer, Produto> bancoDeDados = new HashMap<>();

    public Produto createProduto(String nome, double preco, int quantidade) {
        Produto novo = new Produto(posicaoID, nome, preco, quantidade);
        bancoDeDados.put(posicaoID, novo);
        posicaoID++;
        return novo;
    }

    public void readProduto() {
        this.bancoDeDados.forEach((chave, produto) -> produto.toString());
    }

    public void deleteProduto(int codigo) {
        bancoDeDados.remove(codigo);
    }

    public Produto updateProduto(int codigo, String nome, double preco, int quantidade) {
        Produto atualiza = bancoDeDados.get(codigo);
        atualiza.setNome(nome);
        atualiza.setPreco(preco);
        atualiza.setQuantidade(quantidade);
        return atualiza;
    }


}
