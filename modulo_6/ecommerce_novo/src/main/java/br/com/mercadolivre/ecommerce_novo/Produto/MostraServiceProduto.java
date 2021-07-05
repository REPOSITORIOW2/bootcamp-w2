package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Exception.ProdutoNaoEncontradoException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class MostraServiceProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public MostraServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String execute(Long id) {
        Produto produtoEncontrado = produtoRepository.encontrarPorId(id);

        if (produtoEncontrado != null) {
            boolean resultado = produtoRepository.mostra(produtoEncontrado);

        } else {
            throw new ProdutoNaoEncontradoException();
        }
    }


}
