package br.com.meli.ecommerce.dto;

import br.com.meli.ecommerce.entity.Pedido;
import br.com.meli.ecommerce.entity.Produto;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {
    private int codigo;
    private UsuarioDTO usuarioDTO;
    private List<Produto> produtos;

    public PedidoDTO(int codigo, UsuarioDTO usuarioDTO, List<Produto> produtos) {
        this.codigo = codigo;
        this.usuarioDTO = usuarioDTO;
        this.produtos = produtos;
    }

    public PedidoDTO(Pedido pedido) {
        this.codigo = pedido.getCodigo();
        this.usuarioDTO = UsuarioDTO.converter(pedido.getUsuario());
        this.produtos = pedido.getProdutos();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public UsuarioDTO getUsuarioDTO() {
        return usuarioDTO;
    }

    public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public static PedidoDTO converter(Pedido pedido) {
        return new PedidoDTO(pedido.getCodigo(), UsuarioDTO.converter(pedido.getUsuario()), pedido.getProdutos());
    }

    public static List<PedidoDTO> converter(List<Pedido> pedidos) {
        return pedidos.stream()
                .map(PedidoDTO::converter)
                .collect(Collectors.toList());
    }
}
