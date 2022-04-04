package items;

public class Firewood extends Item {

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Firewood);
    }
}
