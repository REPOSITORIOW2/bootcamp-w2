package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public class InfernalSword extends Sword {
    public InfernalSword() {
        super("Infernal Sword");
    }

    @Override
    public void onUseAttack(GameCharacter holder) {
        holder.sendMessage("Você balança a espada, e devido ao calor gerado acaba queimando a mão!");
    }
}
