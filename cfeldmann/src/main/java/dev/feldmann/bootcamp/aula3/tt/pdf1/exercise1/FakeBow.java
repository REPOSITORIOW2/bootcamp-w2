package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public class FakeBow extends Bow{
    public FakeBow() {
        super("Arco Fajuto");
    }

    @Override
    public void onUseAttack(GameCharacter holder) {
        holder.sendMessage("Ao atirar a flecha a corda de seu arco arrebenta! Você esperava mais de um Arco Fajuto?");
        holder.equipItem(null);
    }
}
