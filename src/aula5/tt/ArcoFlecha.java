package aula5.tt;

public class ArcoFlecha extends Arma {

    public ArcoFlecha(String nome, Integer dano) {
        super(nome, dano);
    }

    @Override
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - super.getDano());
        System.out.println("Atacou com arco e flecha! Dano: " + super.getDano());
    }
}
