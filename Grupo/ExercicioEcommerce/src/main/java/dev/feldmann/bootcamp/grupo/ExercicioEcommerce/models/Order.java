package dev.feldmann.bootcamp.grupo.ExercicioEcommerce.models;

import dev.feldmann.bootcamp.grupo.ExercicioEcommerce.utils.Ideable;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Order implements Ideable {
    private long id;
    private long idCliente;
    private List<Long> produtos;

    @Override
    public Long getID() {
        return id;
    }

    @Override
    public void setID(Long id) {
        this.id = id;
    }
}
