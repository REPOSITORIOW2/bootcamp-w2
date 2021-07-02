package Weapons;

public class Sword extends Weapon {
    public Sword(String name, double damage, double attackSpeed) {
        super(name, damage, attackSpeed);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Sword...");
    }
}
