package br.com.mercadolivre.ecommerce_novo.Exception;

public class ProdutoNaoEncontradoException extends RuntimeException {

    public ProdutoNaoEncontradoException() {
        super("Produto não encontrado");
    }
}
