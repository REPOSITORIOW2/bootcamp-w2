package br.com.meli.ecommerce.service;

import br.com.meli.ecommerce.entity.Pedido;
import br.com.meli.ecommerce.entity.Produto;
import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.repository.PedidoRepository;
import br.com.meli.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {
    private final PedidoRepository repository;
    private final ProdutoRepository produtoRepository;

    @Autowired
    public PedidoService(PedidoRepository repository, ProdutoRepository produtoRepository) {
        this.repository = repository;
        this.produtoRepository = produtoRepository;
    }

    public void addPedido(Usuario usuario, List<String> codigoProdutos) {
        if (usuario.isAdministrador()) {
            throw new HttpClientErrorException(HttpStatus.UNAUTHORIZED, "Usuário não é um cliente.");
        } else {
            int codigo = repository.getList().get(repository.getList().size() - 1).getCodigo() + 1;

            List<Produto> produtos = codigoProdutos.
                    stream()
                    .map(produtoRepository::getByCodigo)
                    .collect(Collectors.toList());

            repository.adicionar(
                    new Pedido(codigo,
                            usuario,
                            produtos
                    )
            );
        }
    }

    public List<Pedido> getList() {
        return repository.getList();
    }

    public Pedido getPedidoByCodigo(int codigo) {
        return repository.getByCodigo(codigo);
    }

    public List<Pedido> getPedidosByUsuario(String cpf) {
        return repository.getByUsuario(cpf);
    }
}
