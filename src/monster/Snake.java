package monster;

import java.util.Random;

public class Snake extends Monster {
    public Snake(){
        super.ID = 4;
        super.damage = new Random().nextInt(4)+3;
        super.hp = 12;
        super.gold = 0;
    }
}
