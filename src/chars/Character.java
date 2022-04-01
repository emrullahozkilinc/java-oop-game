package chars;

import armor.Armor;
import weapon.Weapon;

public abstract class Character {

    long ID;
    int damage;
    int hp;
    int gold;
    int block;
    Armor armor;
    Weapon weapon;

    Character (){
        block = 0;
        armor = null;
        weapon = null;
    }

    @Override
    public String toString() {
        return "Character{" +
                "ID=" + ID +
                ", damage=" + damage +
                ", hp=" + hp +
                ", gold=" + gold +
                ", block=" + block +
                ", armor=" + armor +
                ", weapon=" + weapon +
                '}';
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
        block = armor.getBlock();
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
        damage = getDamage() + weapon.getDamage() - this.weapon.getDamage();
    }

    public int getBlock() {
        return block;
    }

    public int getDamage() {
        return damage;
    }
}