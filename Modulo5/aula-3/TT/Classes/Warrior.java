package Classes;

import Weapons.Weapon;
import Weapons.Bow;

import java.util.Objects;

public class Warrior extends PhysicalClass {
    public Warrior() {
        this.classPhysicalDamage = 5;
        this.strength = 8;
    }

    @Override
    public float calculateDamage(Weapon weapon, short diceRoll) {
        float debuff = Objects.isNull(weapon) ? -5 : (float) weapon.getDamage();
        return (diceRoll % 20 - 10 + this.strength) * classPhysicalDamage + debuff;
    }

    @Override
    public boolean canUseWeapon(Weapon weapon) {
        return !(weapon instanceof Bow);
    }
}
