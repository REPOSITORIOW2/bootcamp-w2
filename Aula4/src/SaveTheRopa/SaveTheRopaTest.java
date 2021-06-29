package SaveTheRopa;

import java.util.Arrays;
import java.util.List;

public class SaveTheRopaTest {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        Vestuario roupa1 = new Vestuario("Zara", "Camisa");
        Vestuario roupa2 = new Vestuario("Hering", "Camiseta");
        Vestuario roupa3 = new Vestuario("Nike", "Bermuda");
        Vestuario roupa4 = new Vestuario("Calvin Klein", "Cueca");
        Vestuario roupa5 = new Vestuario("Adidas", "Casaco");

        List<Vestuario> roupasCliente1 = Arrays.asList(roupa1, roupa2);
        List<Vestuario> roupasCliente2 = Arrays.asList(roupa3, roupa4);
        List<Vestuario> roupasCliente3 = Arrays.asList(roupa5);

        int idCliente1 = guardaRoupa.guardarVestuarios(roupasCliente1);
        int idCliente2 = guardaRoupa.guardarVestuarios(roupasCliente2);
        int idCliente3 = guardaRoupa.guardarVestuarios(roupasCliente3);

        guardaRoupa.mostrarVestuarios();

        List<Vestuario> roupasClienteDevolucao = guardaRoupa.devolverVestuarios(idCliente2);
        System.out.println(roupasClienteDevolucao);

        guardaRoupa.mostrarVestuarios();
    }
}
