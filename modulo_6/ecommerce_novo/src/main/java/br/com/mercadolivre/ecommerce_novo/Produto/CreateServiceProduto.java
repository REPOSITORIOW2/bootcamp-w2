package br.com.mercadolivre.ecommerce_novo.Produto;


import br.com.mercadolivre.ecommerce_novo.Exception.NotAdministratorException;
import br.com.mercadolivre.ecommerce_novo.Usuario.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateServiceProduto {

    private ProdutoRepository produtoRepository;

    @Autowired
    public CreateServiceProduto(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Produto execute(Level level, ProdutoDTO produtoDTO) {
        if (level.equals(Level.ADMINISTRADOR))
            return produtoRepository.save(ProdutoDTO.converte(produtoDTO));
        throw new NotAdministratorException();
    }
}
