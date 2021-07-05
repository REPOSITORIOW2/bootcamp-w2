package br.com.meli.modulo6aula4.dtos;

import br.com.meli.modulo6aula4.enums.UsuarioEnum;

import java.util.List;

public class UsuarioDTO {

    private String nome;
    private long id;
    private UsuarioEnum tipo;
    private List<PedidoDTO> pedido;

    public UsuarioDTO() {
    }

    public UsuarioDTO(String nome, long id, UsuarioEnum tipo, List<PedidoDTO> pedido) {
        this.nome = nome;
        this.id = id;
        this.tipo = tipo;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UsuarioEnum getTipo() {
        return tipo;
    }

    public void setTipo(UsuarioEnum tipo) {
        this.tipo = tipo;
    }

    public List<PedidoDTO> getPedido() {
        return pedido;
    }

    public void setPedido(List<PedidoDTO> pedido) {
        this.pedido = pedido;
    }
}
