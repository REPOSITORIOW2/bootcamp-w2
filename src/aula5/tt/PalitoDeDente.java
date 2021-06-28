package aula5.tt;

public class PalitoDeDente extends Arma {

    public PalitoDeDente(String nome, Integer dano) {
        super(nome, dano);
    }

    @Override
    public void atacar(Personagem p) {
        p.setVida(p.getVida() - super.getDano());
        System.out.println("Atacou com palito de dente! Dano: " + super.getDano());
    }
}
