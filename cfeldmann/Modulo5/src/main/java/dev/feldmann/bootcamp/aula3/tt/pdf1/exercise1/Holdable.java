package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

public interface Holdable {
    void onUseAttack(GameCharacter holder);

    /**
     * @param holder
     * @return Defines if the {holder} can use this holdable, if the return is false, the item won't be equiped
     */
    boolean onEquip(GameCharacter holder);

    /**
     * Notification when the item is unequipped
     * @param holder
     */
    void onUnequip(GameCharacter holder);


    String getDisplayName();
}
