package br.com.meli.modulo6aula4.dtos;

import java.util.List;

public class PedidoDTO {

    private Long id;
    private List<ProdutosDTO> produtos;
    private Long usuarioId;

    public PedidoDTO() {
    }

    public PedidoDTO(Long id, List<ProdutosDTO> produtos, Long usuarioId) {
        this.id = id;
        this.produtos = produtos;
        this.usuarioId = usuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProdutosDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutosDTO> produtos) {
        this.produtos = produtos;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void update(PedidoDTO pedido) {

        setProdutos(pedido.getProdutos());
        setUsuarioId(pedido.getUsuarioId());

    }
}
