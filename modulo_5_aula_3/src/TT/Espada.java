package TT;

public class Espada extends Arma{

    public Espada() {
        super();
    }

    public Espada(double dano){
        super("Espada", dano, 1);
    }

    @Override
    public void atacar(){
        System.out.println("Voce atacou com a espada e causou " + super.dano + "de dano");
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
