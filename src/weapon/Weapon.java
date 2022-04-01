package weapon;

public abstract class Weapon {
    long id;
    int damage;
    int gold;

    public long getId() {
        return id;
    }

    public int getDamage() {
        return damage;
    }

    public int getGold() {
        return gold;
    }
}
