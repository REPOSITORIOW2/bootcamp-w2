package br.com.meli.modulo6aula4.dtos;

import java.util.List;

public class UsuarioPedidoDTO {

    private List<ProdutosDTO> produtos;
    private Long usuarioId;

    public UsuarioPedidoDTO(List<ProdutosDTO> produtos, Long usuarioId) {
        this.produtos = produtos;
        this.usuarioId = usuarioId;
    }

    public UsuarioPedidoDTO() {
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
}
