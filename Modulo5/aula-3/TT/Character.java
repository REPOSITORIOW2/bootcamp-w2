import Classes.Type;
import Weapons.*;
import java.util.Random;

public class Character {

    private String nome;
    private Type type;
    private Weapon weapon;
    private int level;

    public Character(String nome, Type type, Weapon weapon, int level) {
        this.nome = nome;
        this.type = type;
        if(this.type.canUseWeapon(weapon)) {
            this.weapon = weapon;
        } else {
            this.weapon = null;
        }
        this.level = level;
    }

    public float attack() {
        Random rnd = new Random();
        float damage = type.calculateDamage(this.weapon, (short) rnd.nextInt(10));
        if (damage == 0) {
            System.out.println("Attacked with " + this.weapon.getName() + " and missed!");
        } else {
            System.out.println("Attacked with " + this.weapon.getName() + " and dealt " + damage + " points of damage!");
        }
        return damage;
    }

    public void switchWeapon(WeaponType weaponType) {
        Weapon nWeapon = WeaponFactory.getInstance(weaponType);
        if (!type.canUseWeapon(nWeapon)) {
            System.out.println("The type cannot use " + nWeapon.getName() + "! Still holding " + this.weapon.getName() + ".");
            return;
        }
        System.out.println("Switching from " + this.weapon.getName() + " to " + nWeapon.getName() + ".");
        this.weapon = nWeapon;
    }
}
