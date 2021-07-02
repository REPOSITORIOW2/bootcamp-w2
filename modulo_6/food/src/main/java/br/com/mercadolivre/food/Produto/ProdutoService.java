package br.com.mercadolivre.food.Produto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;import java.util.Locale;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    @Autowired
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> getAll() {
        return produtoRepository.getAll();
    }

    public Produto getSpecificFood(String name){
        return produtoRepository.getAll().stream()
                .filter(prod -> prod.getNome().equals(name))
                .findFirst()
                .orElse(null);
    }
}
