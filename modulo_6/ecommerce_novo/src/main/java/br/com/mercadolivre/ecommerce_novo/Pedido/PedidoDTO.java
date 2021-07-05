package br.com.mercadolivre.ecommerce_novo.Pedido;

import br.com.mercadolivre.ecommerce_novo.Usuario.Usuario;

import java.util.List;

import br.com.mercadolivre.ecommerce_novo.Produto.Produto;

public class PedidoDTO {

    private static Long pedidoId = 1L;
    private Long usuarioId;
    private List<Produto> produto;

    public PedidoDTO(Long usuarioId, List<Produto> produto) {
        this.usuarioId = usuarioId;
        this.produto = produto;
    }

    public Long getUsuarioId() {
        return this.usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public List<Produto> getProduto() {
        return this.produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
    public static Pedido converte(PedidoDTO pedidoDTO){
        return new Pedido(pedidoId++, pedidoDTO);
    }

}
