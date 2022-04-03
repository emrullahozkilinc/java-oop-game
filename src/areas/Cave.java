package areas;

import chars.Character;
import items.Firewood;
import items.Food;
import items.Item;
import monster.Monster;
import monster.Zombie;

import java.util.Random;

import static main.Game.getInput;

public class Cave extends DangerArea{

    public Cave() {
        super.monster = new Zombie[new Random().nextInt(2)+1];
        for (int i = 0; i < super.monster.length; i++) {
            super.monster[i] = new Zombie();
        }
    }

    @Override
    void getItems(Character character) {
        character.addItem(new Food());
        if(character.checkItem()){
            System.out.println("You won!");
            System.exit(0);
        }
    }
}
