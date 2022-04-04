package items;

public class Food extends Item {

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Food);
    }
}
