import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GuardaRoupa guarda = new GuardaRoupa();
        
        List<Vestuario> roupasDoBruninho = Arrays.asList(
            new Vestuario("Gucci", "Camiseta Oversized com Logo XS"),
            new Vestuario("Hering", "Jaqueta Feminina M - Rosa")
        );

        List<Vestuario> roupasDoLuquinhas = Arrays.asList(
            new Vestuario("Nike", "Jaqueta Corta-Vento Preta - XXXL"),
            new Vestuario("Polo Wear", "Camiseta Verde Básica")
        );
        
        Integer id = guarda.guardarVestuarios(roupasDoBruninho);
        guarda.mostrarVestuarios();

        Integer id2 = guarda.guardarVestuarios(roupasDoLuquinhas);
        guarda.mostrarVestuarios();
        roupasDoLuquinhas = guarda.devolverVestuarios(id2);
    }
    
}

// agiliza ai pfvr