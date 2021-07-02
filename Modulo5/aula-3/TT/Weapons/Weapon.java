package Weapons;

import java.util.Comparator;

public class Weapon{

    private String name;
    private double damage;
    private double attackSpeed;

    public Weapon(String name, double damage, double attackSpeed) {
        this.name = name;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public void attack(){
        System.out.println("Attacking with bare fists...");
    }

    @Override
    public String toString() {
        return "Weapon: " + this.getName() + ".";
    }
}
