package areas;

import chars.Character;
import items.Firewood;
import monster.Vampire;

import java.util.Random;

public class Jungle extends DangerArea{

    public Jungle() {
        super.monster = new Vampire[new Random().nextInt(3)+1];
        for (int i = 0; i < super.monster.length; i++) {
            super.monster[i] = new Vampire();
        }
    }

    @Override
    void getItems(Character character) {
        character.addItem(new Firewood());
        super.getItems(character);
    }
}
