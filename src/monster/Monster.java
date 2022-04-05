package monster;

import chars.Character;
import items.Item;

public abstract class Monster {
    long ID;
    int damage;
    int hp;
    int gold;

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "ID=" + ID +
                ", damage=" + damage +
                ", hp=" + hp +
                ", gold=" + gold +
                '}';
    }

    public void takeItems(Character character) {
        System.out.println("You got " + gold + " gold.");
        character.addGold(gold);
    }
}
