package chars;

import areas.Area;
import armor.Armor;
import items.Item;
import weapon.Weapon;

import java.util.LinkedList;

public abstract class Character {

    long ID;
    int damage;
    int hp;
    int gold;
    int block;
    Armor armor;
    Weapon weapon;
    Area area;
    LinkedList<Item> items;

    Character (){
        block = 0;
        armor = null;
        weapon = null;
        items = new LinkedList<>();
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
        block = armor.getBlock();
    }

    public void setWeapon(Weapon weapon) {
        if(this.weapon != null) {
            damage = getDamage() + weapon.getDamage() - this.weapon.getDamage();
        }else {
            damage = getDamage() + weapon.getDamage();
        }
        this.weapon = weapon;
    }

    public int getBlock() {
        return block;
    }

    public int getDamage() {
        return damage;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public Area getArea() {
        return area;
    }

    public abstract int defaultHP();

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGold() {
        return gold;
    }

    public void addGold(int gold){
        this.gold += gold;
    }

    public void addItem(Item item) {
        if (!items.contains(item)){
            items.add(item);
            System.out.println("You got " + item.getClass().getSimpleName());
        }
    }

    public boolean checkItem() {
        return items.size() == 3;
    }

    public LinkedList<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", damage=" + damage +
                ", hp=" + hp +
                ", gold=" + gold +
                ", block=" + block +
                ", armor=" + ((armor==null)?null:armor.toString()) +
                ", weapon=" + ((weapon==null)?null:weapon.toString()) +
                ", area=" + ((area==null)?null:area.toString()) +
                ", items=" + ((items==null)?null:items.toString()) +
                '}';
    }
}