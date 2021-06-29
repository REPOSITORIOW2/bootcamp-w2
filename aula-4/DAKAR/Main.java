import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Corrida corrida = new Corrida(100, new BigDecimal(1000), "Fórmula 1", 5);
        
        System.out.println("\nIniciando a corrida...\n");

        corrida.registrarCarro(100, 2.5, 20, "UFO-1323");
        corrida.registrarCarro(10, 4.0, 45, "JUO-1020");
        corrida.registrarCarro(40, 3.0, 30, "ABC-1231");
        corrida.registrarCarro(40, 3.0, 25, "ABC-1231");
        corrida.registrarMoto(150, 1.0, 18, "MOT-0123");
        corrida.registrarMoto(180, 2.0, 40, "MOT-0456");
        corrida.registrarMoto(150, 1.0, 18, "CAR-1337");

        System.out.println("\nSocorrendo veículos na corrida...\n");

        corrida.socorrerCarro("ABC-1231");
        corrida.socorrerCarro("NAO-EXISTE-CARRO");

        corrida.socorrerMoto("MOT-0456");

        System.out.println("\nDeterminando o vencedor da corrida...\n");

        corrida.determinaVencedor();
    }
}
