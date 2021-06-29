import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GuardaRoupa{

    private Map<Integer, List<Vestuario>> guardaRoupa;
    private static int id = 1;

    public GuardaRoupa() {
        this.guardaRoupa = new HashMap<Integer, List<Vestuario>>();
    }

    public GuardaRoupa(Map<Integer, List<Vestuario>> guardaRoupa) {
        this.guardaRoupa = guardaRoupa;
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario) {
        this.guardaRoupa.put(id, listaDeVestuario);
        return id++;
    }

    public void mostrarVestuarios() {
        for (Entry<Integer, List<Vestuario>>  entry : guardaRoupa.entrySet()) {
            Integer identificador = entry.getKey();
            List<Vestuario> listaVestuario = entry.getValue();

            System.out.println("Vestuário " + identificador);
            System.out.println("Roupas: ");
            listaVestuario.forEach(vestuario -> System.out.println("\t" + vestuario));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) throws RuntimeException {
        if(!guardaRoupa.containsKey(id)){
            throw new RuntimeException("Não existe uma lista de vestuário com o id informado.");
        }
        return guardaRoupa.remove(id);
    }
}