package chars;

public abstract class Character {

    long ID;
    int damage;
    int hp;
    int gold;

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", damage=" + damage +
                ", hp=" + hp +
                ", gold=" + gold +
                '}';
    }
}