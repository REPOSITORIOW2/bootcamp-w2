package Classes;

import Weapons.Bow;
import Weapons.Sword;
import Weapons.Weapon;

import java.util.Objects;

public class Archer extends PhysicalClass implements Type {
    public Archer() {
        this.classPhysicalDamage = 2;
        this.strength = 3;
    }

    @Override
    public float calculateDamage(Weapon weapon, short diceRoll) {
        float debuff = Objects.isNull(weapon) ? -2 : (float) weapon.getDamage();
        return (diceRoll % 20 - 10 + this.strength) * classPhysicalDamage + debuff;
    }

    @Override
    public boolean canUseWeapon(Weapon weapon) {
        return weapon instanceof Bow;
    }
}
