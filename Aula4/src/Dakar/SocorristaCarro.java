package Dakar;

public class SocorristaCarro extends Veiculo{

    public void socorrer(Carro carro){
        System.out.println("Socorrendo Carro : " + carro.getPlaca());

    }

    public SocorristaCarro() {
        super();
    }
}
