package areas;

import chars.Character;
import main.Game;

public class SafetyHome extends SafeArea{

    @Override
    public void onLocation(Character character) {
        System.out.println("You are in a safe home.");
        character.setHp(character.defaultHP());
        System.out.println("Your HP is restored to " + character.getHp() + ".");
        Game.go(character);
    }
}
