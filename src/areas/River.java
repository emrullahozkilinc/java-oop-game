package areas;

import chars.Character;
import items.Water;
import monster.Bear;

import java.util.Random;

public class River extends DangerArea{

    public River() {
        super.monster = new Bear[new Random().nextInt(3)+1];
        for (int i = 0; i < super.monster.length; i++) {
            super.monster[i] = new Bear();
        }
    }

    @Override
    void getItems(Character character) {
        character.addItem(new Water());
        super.getItems(character);
    }
}
