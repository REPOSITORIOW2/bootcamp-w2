package br.com.meli.restaurante.repository;

import br.com.meli.restaurante.Pedido;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
@Service
public interface RestauranteRepository {
    public List<Pedido> loadResource();
    public Pedido addResource(Pedido pedido) throws IOException;
    public List<Pedido> deleteResource(Pedido pedido) throws IOException;
    public List<Pedido> updateResource(Pedido pedidoVelho, Pedido pedidoNovo) throws IOException;
}
