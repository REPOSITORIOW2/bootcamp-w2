package dev.feldmann.bootcamp.modulo6.restaurante.service;

import dev.feldmann.bootcamp.modulo6.restaurante.entity.Mesa;
import dev.feldmann.bootcamp.modulo6.restaurante.entity.Pedido;
import dev.feldmann.bootcamp.modulo6.restaurante.entity.Prato;
import dev.feldmann.bootcamp.modulo6.restaurante.forms.PedidoForm;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service
public class RestauranteService {
    private Double caixa;
    private List<Mesa> mesas;


    public RestauranteService() {
        caixa = 0.0;
        mesas = new ArrayList<>();
        createMesas(20);
    }

    public void createMesas(int amount) {
        for (long i = 1; i <= amount; i++) {
            mesas.add(new Mesa(i));
        }
    }

    public Optional<Mesa> findMesaById(Long id) {
        return mesas.stream().filter(mesa -> mesa.getId().equals(id)).findFirst();
    }


    public void fecharPedido(Mesa mesa) {
        caixa += mesa.calculateTotalPrice();
        mesa.clearPedidos();
    }


    public Long getMesasOcupadas() {
        return mesas.stream().filter(Mesa::hasPedidos).count();
    }

    public Long getMesasLivres() {
        return mesas.stream().filter(Predicate.not(Mesa::hasPedidos)).count();
    }

    public Double getCaixa() {
        return caixa;
    }

    public Double getDinheiroAReceber() {
        return mesas.stream().mapToDouble(Mesa::calculateTotalPrice).sum();
    }

    public void fazerPedido(Mesa mesa, PedidoForm form) {
        Pedido p = new Pedido(mesa);

        form.getPratos().stream()
                .map(pratoForm -> new Prato(pratoForm.getPreco().doubleValue(), pratoForm.getDescription(), pratoForm.getQuantidade()))
                .forEach(p::addPrato);

        mesa.addPedido(p);
    }
}
