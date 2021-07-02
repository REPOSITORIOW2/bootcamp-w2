package Weapons;

public class Axe extends Weapon {
    public Axe(String name, double damage, double attackSpeed) {
        super(name, damage, attackSpeed);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Axe...");
    }
}
