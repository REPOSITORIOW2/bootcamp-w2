package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public abstract class Sword extends Item implements Holdable{
    public Sword(String name) {
        super(name);
    }


    @Override
    public boolean onEquip(GameCharacter holder) {
        if(holder.getCharacterClass()==CharacterClass.MONK){
            holder.sendMessage("Você é um monge e não sabe como usar uma espada!");
            return false;
        }
        return false;
    }

    @Override
    public void onUnequip(GameCharacter holder) {
        // Do nothing
    }

    @Override
    public String getDisplayName() {
        return this.getName();
    }
}
