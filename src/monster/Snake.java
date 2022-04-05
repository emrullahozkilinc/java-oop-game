package monster;

import armor.Heavy;
import armor.Light;
import armor.Medium;
import chars.Character;
import weapon.Pistol;
import weapon.Rifle;
import weapon.Sword;

import java.util.Random;

public class Snake extends Monster {
    public Snake(){
        super.ID = 4;
        super.damage = new Random().nextInt(4)+3;
        super.hp = 12;
        super.gold = 0;
    }

    @Override
    public void takeItems(Character character) {
        //Weapon
        if (Math.random()<0.15){
            double rand = Math.random();
            if(rand<0.2){
                character.setWeapon(new Rifle());
                System.out.println("You got a Rifle");
            }else if(rand<0.5){
                character.setWeapon(new Sword());
                System.out.println("You got a Sword");
            }else {
                character.setWeapon(new Pistol());
                System.out.println("You got a Pistol");
            }
        }
        //Armor
        if (Math.random()<0.15){
            double rand = Math.random();
            if(rand<0.2){
                character.setArmor(new Heavy());
                System.out.println("You got a Heavy Armor");
            }else if(rand<0.5){
                character.setArmor(new Medium());
                System.out.println("You got a Medium Armor");
            }else {
                character.setArmor(new Light());
                System.out.println("You got a Light Armor");
            }
        }
        //Gold
        if (Math.random()<0.25){
            double rand = Math.random();
            if(rand<0.2){
                character.addGold(10);
                System.out.println("You got 10 Gold");
            }else if(rand<0.5){
                character.addGold(5);
                System.out.println("You got 5 Gold");
            }else {
                character.addGold(1);
                System.out.println("You got 1 Gold");
            }
        }
    }
}
