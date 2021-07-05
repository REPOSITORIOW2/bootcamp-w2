package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Produto.Categorias;
import br.com.mercadolivre.ecommerce_novo.Produto.Produto;
import br.com.mercadolivre.ecommerce_novo.Usuario.Usuario;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ProdutoDTO {

    private static Long produtoId = 1L;
    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private List<Categorias> categorias;

    public ProdutoDTO(String nome, BigDecimal valor, int quantidade, List<Categorias> categorias) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
        this.categorias = categorias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public List<Categorias> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categorias> categorias) {
        this.categorias = categorias;
    }

    public static Produto converte(ProdutoDTO produtoDTO) {
        return new Produto(produtoId++, produtoDTO);
    }

    public static ProdutoDTO converte(Produto produto){
        return new ProdutoDTO(produto.getNome(),
                              produto.getValor(),
                              produto.getQuantidade(),
                              produto.getCategorias());
    }

    public static List<ProdutoDTO> converte(List<Produto> listaProdutos){
        return listaProdutos.stream()
                .map(ProdutoDTO::converte)
                .collect(Collectors.toList());
    }
}
