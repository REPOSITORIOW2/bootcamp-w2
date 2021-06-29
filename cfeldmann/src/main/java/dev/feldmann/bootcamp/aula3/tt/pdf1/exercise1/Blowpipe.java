package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public class Blowpipe extends Item implements Holdable{
    public Blowpipe() {
        super("Zarabatana");
    }

    @Override
    public void onUseAttack(GameCharacter holder) {
        holder.sendMessage("Você tentou usar a Zarabatana, e falhou miseravelmente, sugando um dardo direto para sua garganta");
    }

    @Override
    public boolean onEquip(GameCharacter holder) {
        // Todo mundo pode usar
        return true;
    }

    @Override
    public void onUnequip(GameCharacter holder) {

    }

    @Override
    public String getDisplayName() {
        return this.getName();
    }
}
