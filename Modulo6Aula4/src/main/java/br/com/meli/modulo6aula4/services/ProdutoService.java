package br.com.meli.modulo6aula4.services;

import br.com.meli.modulo6aula4.dtos.ProdutosDTO;
import br.com.meli.modulo6aula4.dtos.UsuarioDTO;
import br.com.meli.modulo6aula4.enums.ProdutoEnum;
import br.com.meli.modulo6aula4.enums.UsuarioEnum;
import br.com.meli.modulo6aula4.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    ProdutoRepository produtoRepository;

    public ProdutosDTO adicionaProduto(ProdutosDTO produto, UsuarioDTO usuario) {

        if (usuario.getTipo().equals(UsuarioEnum.ADMINISTRADOR)) {
            produtoRepository.add(produto);
            return produtoRepository.getById(produto.getId());
        }
        return null;
    }

    public List<ProdutosDTO> getAll() {
        return produtoRepository.getList();
    }

    public List<ProdutosDTO> getByCategory(ProdutoEnum categoria) {
        return produtoRepository.getByCategory(categoria);
    }

    public ProdutosDTO atualizarProduto(ProdutosDTO produto) {
        produtoRepository.atualizar(produto);

        return produtoRepository.getById(produto.getId());
    }

    public void deletarProduto(Long id) {

        produtoRepository.deletar(produtoRepository.getById(id));
    }
}
