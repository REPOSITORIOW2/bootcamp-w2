package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Exception.ProdutoNaoEncontradoException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MostraServiceProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public MostraServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto execute(Long id) {
        Produto produtoEncontrado = produtoRepository.encontrarPorId(id);

        if (produtoEncontrado != null) {
            return produtoEncontrado;

        } else {
            throw new ProdutoNaoEncontradoException();
        }
    }

    public List<Produto> execute(){
        return ProdutoRepository.getProdutos();
    }


}
