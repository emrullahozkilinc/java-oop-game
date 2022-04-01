package chars;

public class Knight extends Character{
    public Knight() {
        super();
        super.ID = 3;
        super.damage = 8;
        super.hp = 24;
        super.gold = 5;
    }

    @Override
    public int defaultHP() {
        return 24;
    }
}
