package aula5.tt;

public class Espada extends Arma {
    public Espada(String nome, Integer dano) {
        super(nome, dano);
    }

    @Override
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - super.getDano());
        System.out.println("Atacou com espada! Dano: " + super.getDano());
    }
}
