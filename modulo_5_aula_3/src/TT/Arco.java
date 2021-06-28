package TT;

public class Arco extends Arma{
    int quantidadeFlechas = 50;

    public Arco(){
        super();
    }

    public Arco(double dano, double distancia) {
        super("Arco", dano, distancia);
    }

    @Override
    public void atacar() {
        if (this.quantidadeFlechas <= 0){
            System.out.println("Voce nao pode atacar, pois nao possui flechas!");
        }
        else{
            this.quantidadeFlechas -= 1;
            System.out.println("Voce atacou com um arco e flecha a uma distancia de " + super.distancia
                + "e causou " + super.dano + "de dano.\nQuantidade de flechas = " + this.quantidadeFlechas);
        }
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
