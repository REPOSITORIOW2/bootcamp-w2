package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public abstract class Bow extends Item implements Holdable {

    public Bow(String name) {
        super(name);
    }

    @Override
    public boolean onEquip(GameCharacter holder) {
        if (holder.getCharacterClass() != CharacterClass.ARCHER) {
            holder.sendMessage("Somente arqueiros podem usar o arco!");
            return false;
        }
        return true;
    }

    @Override
    public void onUnequip(GameCharacter holder) {
        // Does nothing
    }

    @Override
    public String getDisplayName() {
        return this.getName();
    }
}
