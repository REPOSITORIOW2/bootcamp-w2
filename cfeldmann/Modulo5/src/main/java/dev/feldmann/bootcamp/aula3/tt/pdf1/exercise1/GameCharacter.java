package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public class GameCharacter {

    private String name;
    private CharacterClass characterClass;
    private Holdable handSlot = null;
    private int level = 1;

    public GameCharacter(String name, CharacterClass characterClass) {
        this.name = name;
        this.characterClass = characterClass;
    }

    public void attack() {
        if (this.handSlot == null) {
            this.sendMessage("Você não tem nenhuma arma! Então manda um hang loose");
            return;
        }
        this.handSlot.onUseAttack(this);

    }

    public boolean equipItem(Holdable holdable) {
        // Users can hold 'null' to hold nothing
        if (holdable != null) {
            if (!holdable.onEquip(this)) {
                return false;
            }
        }
        if (this.handSlot != null) {
            // Notifies the current holdable that we unequipped it
            this.handSlot.onUnequip(this);
        }
        if (holdable != null) {
            sendMessage("Você equipou " + holdable.getDisplayName() + "!");
        } else if (this.handSlot != null) {
            sendMessage("Você desequipou " + this.handSlot.getDisplayName() + "!");
        }
        this.handSlot = holdable;
        return true;
    }

    public void sendMessage(String msg) {
        System.out.printf("[%s]: %s%n", this.name, msg);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", class=" + characterClass.name() +
                '}';
    }


}
