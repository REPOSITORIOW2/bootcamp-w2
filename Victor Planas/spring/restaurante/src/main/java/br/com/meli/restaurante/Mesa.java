package br.com.meli.restaurante;

import br.com.meli.restaurante.repository.RestauranteRepository;
import br.com.meli.restaurante.repository.RestauranteRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Mesa {
    private int id;
    private List<Pedido> pedidos;
    private double valorTotal;


    public Mesa(int id) {
        this.id = id;
        this.pedidos = new ArrayList<>();
        this.valorTotal = 0;
    }

    public List<Pedido> getListaPedidos(){
        return this.pedidos;
    }

    public double consumoTotal(){
        double consumo = 0;
        for (Pedido pedido : this.pedidos) {
            consumo += pedido.getValorTotal();
        }
        this.valorTotal = consumo;
        return consumo;
    }

    public double fechaMesa() {
        consumoTotal();
        pedidos.clear();

        return this.valorTotal;
    }

    public List<Pedido> adicionaPedido(Pedido p) throws IOException {
        pedidos.add(p);
        return this.pedidos;
    }


    public int getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public boolean removePedidoByID(int id) throws IOException {
        Optional<Pedido> atual = this.pedidos.stream().filter(pedido -> pedido.getId() == id).findFirst();
        Pedido pedidoAtual = null;
        if(atual.isPresent()){
            return this.pedidos.remove(atual.get());
        }
        return false;
    }

}
