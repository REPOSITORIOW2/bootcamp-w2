package Weapons;


public class WeaponFactory {

    public static Weapon getInstance(WeaponType weaponType) throws IllegalStateException {
        switch (weaponType) {
            case AXE:
                return new Axe("Axe", 20, 1.2);
            case SWORD:
                return new Sword("Sword", 10, 2.2);
            case BOW:
                return new Bow("Bow", 5, 1.234);
            default:
                throw new IllegalStateException("Unexpected value: " + weaponType);
        }
    }
}
