package chars;

public class Archer extends Character{
    public Archer() {
        super();
        super.ID = 2;
        super.damage = 7;
        super.hp = 18;
        super.gold = 20;
    }

    @Override
    public int defaultHP() {
        return 18;
    }
}
