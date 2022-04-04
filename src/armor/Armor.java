package armor;

public abstract class Armor {
    long id;
    int block;
    int gold;

    public int getBlock() {
        return block;
    }

    public int getGold() {
        return gold;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "id=" + id +
                ", block=" + block +
                ", gold=" + gold +
                '}';
    }
}
