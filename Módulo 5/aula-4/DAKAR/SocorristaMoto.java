public class SocorristaMoto extends SocorristaVeiculo {

    public SocorristaMoto(String placa) {
        super(placa);
    }
    
    public void socorrer(Moto moto) {
        System.out.println("Socorrendo moto " + moto.getPlaca() + ".");
    }
}
