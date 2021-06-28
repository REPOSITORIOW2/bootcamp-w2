package dev.feldmann.bootcamp.aula3.tt.pdf1.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameManager {


    private List<Item> items;

    private Blowpipe blowpipe;
    private FakeBow fakeBow;
    private InfernalSword infernalSword;


    public GameManager() {
        items = new ArrayList<>();
        setupItems();
    }

    void setupItems() {
        infernalSword = new InfernalSword();
        fakeBow = new FakeBow();
        blowpipe = new Blowpipe();
        items.addAll(Arrays.asList(
                blowpipe,
                fakeBow,
                infernalSword
        ));
    }


    public List<Item> sortedWeapons() {
        var clone = new ArrayList<>(items);
        clone.sort((item, anotherItem) -> item.getName().compareToIgnoreCase(anotherItem.getName()));
        return clone;
    }

    public void equipAndAttack(GameCharacter character, Holdable holdable) {
        if (character.equipItem(holdable)) {
            character.attack();
        }
    }

    public void runTests() {
        System.out.println("Loading items:");
        System.out.println(Arrays.toString(sortedWeapons().toArray()));
        System.out.println();
        System.out.println("======== Starting game ========");
        System.out.println();
        GameCharacter monk = new GameCharacter("xxxNetinhoPVP__xx", CharacterClass.MONK);
        GameCharacter archer = new GameCharacter("ZeGamerBR", CharacterClass.ARCHER);

        monk.attack();
        equipAndAttack(monk, infernalSword);
        equipAndAttack(monk, fakeBow);
        equipAndAttack(monk, blowpipe);

        // New line
        System.out.println();

        archer.attack();
        equipAndAttack(archer, infernalSword);
        equipAndAttack(archer, fakeBow);
        equipAndAttack(archer, blowpipe);
    }


}
