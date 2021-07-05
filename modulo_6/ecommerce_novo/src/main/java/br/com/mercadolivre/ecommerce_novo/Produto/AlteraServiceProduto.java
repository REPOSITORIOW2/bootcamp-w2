package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Exception.NotAdministratorException;
import br.com.mercadolivre.ecommerce_novo.Exception.ProdutoNaoEncontradoException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlteraServiceProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public AlteraServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String execute(Long id, ProdutoDTO produtoDTO, Level level) {
        if (level.equals(Level.ADMINISTRADOR)) {
            Produto produtoEncontrado = produtoRepository.encontrarPorId(id);

            if (produtoEncontrado != null) {
                ProdutoRepository.alterarProduto(id, produtoDTO, produtoEncontrado);
                return "Produto alterado";
            } else {
                throw new ProdutoNaoEncontradoException();
            }
        }
        throw new NotAdministratorException();
    }


}
