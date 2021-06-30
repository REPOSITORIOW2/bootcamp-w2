package SaveTheRopa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    Integer id;
    Map<Integer, List<Vestuario>> cabideiros;

    public GuardaRoupa() {
        this.id = 0;
        this.cabideiros = new HashMap<Integer, List<Vestuario>>();
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        Integer idAtual = this.id;
        this.cabideiros.put(this.id, listaDeVestuario);
        this.id++;
        return idAtual;
    }

    public void mostrarVestuarios() {
        System.out.println(this.cabideiros);
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        List<Vestuario> roupas = this.cabideiros.computeIfPresent(id, (k, v) -> v);
        this.cabideiros.remove(id);
        return roupas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<Integer, List<Vestuario>> getCabideiros() {
        return cabideiros;
    }

    public void setCabideiros(Map<Integer, List<Vestuario>> cabideiros) {
        this.cabideiros = cabideiros;
    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "id=" + id +
                ", guardaRoupas=" + cabideiros +
                '}';
    }
}
