package Classes;

import Weapons.Weapon;

public abstract class MagicalClass implements Type {
    protected float magicalDamage;

    @Override
    public boolean canUseWeapon(Weapon weapon) {
        return false;
    }
}
