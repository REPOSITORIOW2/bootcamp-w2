package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Exception.NotAdministratorException;
import br.com.mercadolivre.ecommerce_novo.Exception.ProdutoNaoEncontradoException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveServiceProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public RemoveServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto execute(Long id)
    }

    public List<Produto> execute(){

    }
}
