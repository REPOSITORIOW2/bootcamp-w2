package Weapons;

public class Bow extends Weapon {

    public Bow(String name, double damage, double attackSpeed) {
        super(name, damage, attackSpeed);
    }

    @Override
    public void attack() {
        System.out.println("Attacking with Bow...");
    }
}
