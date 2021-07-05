package br.com.meli.ecommerce.repository;

import br.com.meli.ecommerce.entity.Pedido;
import br.com.meli.ecommerce.entity.Produto;
import br.com.meli.ecommerce.entity.Usuario;
import br.com.meli.ecommerce.enumerator.Role;
import org.springframework.stereotype.Repository;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class PedidoRepository {

    private static final List<Pedido> pedidos = new ArrayList<Pedido>(
            Arrays.asList(
                    new Pedido(1,
                            new Usuario("Igor Ventorim", "111.111.111-11", "igor@mercadolivre.com", Role.CLIENTE),
                            List.of(
                                    new Produto("PROD-01", "PS5", 5000.00, List.of("Eletrônicos", "Video-games")),
                                    new Produto("PROD-02", "XBOX", 4500.00, List.of("Eletrônicos", "Video-games"))
                            )
                    ),
                    new Pedido(2,
                            new Usuario("João Pedro", "222.222.222-22", "joao@mercadolivre.com", Role.CLIENTE),
                            List.of(
                                    new Produto("PROD-02", "XBOX", 4500.00, List.of("Eletrônicos", "Video-games")),
                                    new Produto("PROD-03", "Calça de moletom", 99.00, List.of("Roupas"))
                            )
                    ),
                    new Pedido(3,
                            new Usuario("Vitor Vasconcellos", "555.555.555-55", "vitor@mercadolivre.com", Role.CLIENTE),
                            List.of(
                                    new Produto("PROD-02", "XBOX", 4500.00, List.of("Eletrônicos", "Video-games"))
                            )
                    )
            )
    );

    public List<Pedido> getList() {
        return pedidos;
    }

    public void adicionar(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void remover(int codigo) {
        pedidos.remove(this.getByCodigo(codigo));
    }

    public Pedido getByCodigo(int codigo) {
        return pedidos.stream()
                .filter(p -> p.getCodigo() == codigo)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Pedido " + codigo + " não encontrado."));
    }

    public List<Pedido> getByUsuario(String cpf) {
        return pedidos.stream()
                .filter(p -> p.getUsuario().getCpf().equals(cpf))
                .collect(Collectors.toList());
    }

}
