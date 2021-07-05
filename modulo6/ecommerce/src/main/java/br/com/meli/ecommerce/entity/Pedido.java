package br.com.meli.ecommerce.entity;


import java.util.List;

public class Pedido {
    private int codigo;
    private Usuario usuario;
    private List<Produto> produtos;

    public Pedido(Usuario usuario, List<Produto> produtos) {
        this.usuario = usuario;
        this.produtos = produtos;
    }

    public Pedido(int codigo, Usuario usuario, List<Produto> produtos) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.produtos = produtos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
