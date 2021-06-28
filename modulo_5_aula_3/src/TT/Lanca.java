package TT;

public class Lanca extends Arma{

    public Lanca (){
        super();
    }

    public Lanca (double distancia, double dano){
        super("Lanca", distancia, dano);
    }

    @Override
    public void atacar(){
        System.out.println("Voce atacou com uma lança a uma distancia de " + super.distancia + " e causou " + super.dano + "de dano");
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
