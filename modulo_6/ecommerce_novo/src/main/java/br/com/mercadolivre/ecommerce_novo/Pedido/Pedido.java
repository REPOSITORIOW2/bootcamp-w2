package br.com.mercadolivre.ecommerce_novo.Pedido;

import br.com.mercadolivre.ecommerce_novo.Usuario.Usuario;

import java.util.List;

import br.com.mercadolivre.ecommerce_novo.Produto.Produto;

public class Pedido {

    private Long id;
    private Long usuarioId;
    private List<Produto> pedido;

    public Pedido() {
    }



    public Pedido(Long id, PedidoDTO pedidoDTO){
        this.id = id;
        this.usuarioId = pedidoDTO.getUsuarioId();
        this.pedido = pedidoDTO.getProduto();
    }

    public Pedido(Long usuarioId, List<Produto> pedido) {
        this.usuarioId = usuarioId;
        this.pedido = pedido;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUsuarioId() {
        return this.usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }


    public List<Produto> getPedido() {
        return this.pedido;
    }

    public void setPedido(List<Produto> pedido) {
        this.pedido = pedido;
    }
    
}
