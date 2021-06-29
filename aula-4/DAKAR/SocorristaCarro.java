public class SocorristaCarro extends SocorristaVeiculo {
    
    SocorristaCarro(String placa) {
        super(placa);
    }

    public void socorrer(Carro carro) {
        System.out.println("Socorrendo carro " + carro.getPlaca() + ".");
    }
}
