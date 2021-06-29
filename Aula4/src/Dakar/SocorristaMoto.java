package Dakar;

public class SocorristaMoto extends Veiculo{

    public void socorrer(Moto moto){
        System.out.println("Socorrendo Moto : " + moto.getPlaca());
    }

    public SocorristaMoto() {
        super();
    }
}
