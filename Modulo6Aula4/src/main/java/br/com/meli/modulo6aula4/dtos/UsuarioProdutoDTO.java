package br.com.meli.modulo6aula4.dtos;

public class UsuarioProdutoDTO {

    private ProdutosDTO produto;
    private UsuarioDTO usuario;

    public UsuarioProdutoDTO(ProdutosDTO produto, UsuarioDTO usuario) {
        this.produto = produto;
        this.usuario = usuario;
    }

    public UsuarioProdutoDTO() {
    }

    public ProdutosDTO getProduto() {
        return produto;
    }

    public void setProduto(ProdutosDTO produto) {
        this.produto = produto;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }
}
