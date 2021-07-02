import Classes.Paladin;
import Classes.Warrior;
import Weapons.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Weapon> weapons = new ArrayList<>();
        weapons.add(WeaponFactory.getInstance(WeaponType.AXE));
        weapons.add(WeaponFactory.getInstance(WeaponType.SWORD));
        weapons.add(WeaponFactory.getInstance(WeaponType.BOW));

        Collections.sort(weapons, new Comparator<Weapon>() {
            @Override
            public int compare(Weapon w1, Weapon w2) {
                return w1.getName().compareTo(w2.getName());
            }
        });


        weapons.forEach(System.out::println);

        Character player = new Character("Thorin", new Warrior(), WeaponFactory.getInstance(WeaponType.AXE),  10);
        player.attack();

        player.switchWeapon(WeaponType.SWORD);
        player.attack();
        player.attack();

        player.switchWeapon(WeaponType.BOW);
        player.attack();
        player.attack();

        player.switchWeapon(WeaponType.AXE);
        player.attack();
        player.attack();
    }
}


