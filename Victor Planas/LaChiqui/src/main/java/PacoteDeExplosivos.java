import java.util.ArrayList;
import java.util.List;

public class PacoteDeExplosivos implements Explosivo{

    private List<List<Explosivo>> pacote = new ArrayList<>();

    public PacoteDeExplosivos(List<Explosivo> pacote) {

        this.pacote.add(pacote);
    }


    @Override
    public void explode() {
        for (List<Explosivo> explosivos : pacote) {
            for (Explosivo explosivo : explosivos) {
                explosivo.explode();
            }
        }
    }
}
