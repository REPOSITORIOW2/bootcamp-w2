import java.util.*;

public class GuardaRoupa {
    private Map<Integer, List<Vestuario>> dicionario;
    private int contador;

    GuardaRoupa(){
        this.dicionario = new HashMap<>();
    }

    public Integer guardarVestuarios(List<Vestuario> listaDeVestuario){
        dicionario.put(this.contador, listaDeVestuario);
        this.contador++;
        return contador-1;
    }

    public void mostrarVestuarios(){
        for (Integer chave : dicionario.keySet()) {
            System.out.println("-----Guarda Roupa-----\n" +
                    "Chave: " + chave);
            for (Vestuario vestuario : dicionario.get(chave)) {
                System.out.println(vestuario.toString());
            }
        }
    }

   public List<Vestuario> devolverVestuarios(Integer id){
        return this.dicionario.get(id);
   }

    public static void main(String[] args) {
        Vestuario roupa1 = new Vestuario("armani", "macacao");
        Vestuario roupa2 = new Vestuario("gucci", "calca");
        Vestuario roupa3 = new Vestuario("prada", "tenis");
        GuardaRoupa guardaroupa = new GuardaRoupa();
        List<Vestuario> lista = new ArrayList<Vestuario>();
        lista.add(roupa1);
        lista.add(roupa2);
        lista.add(roupa3);
        guardaroupa.guardarVestuarios(lista);
        guardaroupa.mostrarVestuarios();
        lista.remove(roupa1);
        lista.remove(roupa2);
        lista.remove(roupa3);
        guardaroupa.mostrarVestuarios();
    }
}
