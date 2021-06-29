package dev.feldmann.bootcamp.aula4.dakar;

public class Main {
    public static void main(String[] args) {
        var corridaMaluca = new Corrida("Corrida Maluca", 17213, 1_000_000, 16);

        corridaMaluca.registrarCarro(9.2, 7.7, 49, "SDD-1234");
        corridaMaluca.registrarCarro(8, 9.7, 49, "PLA-6666");
        corridaMaluca.registrarCarro(9.0, 9.0, 49, "JNM-9823");

        corridaMaluca.registrarMoto(10, 5.0, 9, "MOT-2314");

        System.out.println("Iniciando corrida maluca");

        corridaMaluca.socorrerCarro("JNM-9823");
        corridaMaluca.socorrerMoto("MOT-2314");

        corridaMaluca.removerVeiculoPorPlaca("SDD-1234");

        Veiculo veiculo = corridaMaluca.calculateWinner();
        System.out.printf("Ganhou a corrida maluca %s%n", veiculo);
    }
}
