package br.com.mercadolivre.ecommerce_novo.Produto;

import br.com.mercadolivre.ecommerce_novo.Exception.NotAdministratorException;
import br.com.mercadolivre.ecommerce_novo.Exception.ProdutoNaoEncontradoException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RemoveServiceProduto {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public RemoveServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public String execute(Level level, Long id){
        if (level.equals(Level.ADMINISTRADOR)){
            Produto produto = produtoRepository.encontrarPorId(id);
            if (produto != null && produtoRepository.remove(produto)) {
                return "Remocao feita com sucesso";
            }
            throw new ProdutoNaoEncontradoException();
        }
        throw new NotAdministratorException();
    }

}
