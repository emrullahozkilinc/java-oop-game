package chars;

public class Samurai extends Character{
    public Samurai() {
        super();
        super.ID = 1;
        super.damage = 5;
        super.hp = 21;
        super.gold = 15;
    }

    @Override
    public int defaultHP() {
        return 21;
    }
}
