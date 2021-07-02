import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeFogos {
    private List<Explosivo> todosOsFogos = new ArrayList<>();



    public void adicionaFogos(Explosivo e){
        todosOsFogos.add(e);
    }

    public List<Explosivo> getTodosOsFogos() {
        return todosOsFogos;
    }
}
