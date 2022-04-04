package items;

public class Water extends Item {

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Water);
    }
}
