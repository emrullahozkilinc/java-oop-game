package areas;

import chars.Character;
import monster.Snake;
import monster.Vampire;

import java.util.Random;

public class MineQuarry extends DangerArea {

    public MineQuarry() {
        super.monster = new Vampire[new Random().nextInt(5)+1];
        for (int i = 0; i < super.monster.length; i++) {
            super.monster[i] = new Snake();
        }
    }

    @Override
    void getItems(Character character) {}
}
