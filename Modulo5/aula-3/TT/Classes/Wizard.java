package Classes;

import java.util.Objects;
import Weapons.*;

public class Wizard extends MagicalClass {
    public Wizard() {
        this.magicalDamage = 10f;
    }

    public float calculateDamage(Weapon weapon, short diceRoll) {
        float debuff = Objects.isNull(weapon) ? 0 : -3;
        return (diceRoll % 20 - 10) * this.magicalDamage + debuff;
    }
}
