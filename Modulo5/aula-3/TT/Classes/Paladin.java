package Classes;

import Weapons.*;

import java.util.Objects;

public class Paladin extends PhysicalClass {
    public Paladin() {
        this.classPhysicalDamage = 3;
        this.strength = 6;
    }

    @Override
    public float calculateDamage(Weapon weapon, short diceRoll) {
        return (diceRoll % 20 - 10 + this.strength) * classPhysicalDamage +
                (Objects.isNull((Object)weapon) ? 0 : (float) weapon.getDamage());
    }

    @Override
    public boolean canUseWeapon(Weapon weapon) {
        return weapon instanceof Sword;
    }
}
