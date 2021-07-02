package Classes;

import Weapons.Weapon;
 
public interface Type {
     boolean canUseWeapon(Weapon weapon);
     float calculateDamage(Weapon weapon, short diceRoll);
}
