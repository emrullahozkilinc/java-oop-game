package areas;

import armor.*;
import chars.Character;
import main.Game;
import weapon.*;

import static main.Game.getInput;
import static main.Game.go;

public class Shop extends SafeArea{
    Armor getArmor(ArmorType type){
        if(type == ArmorType.HEAVY){
            return new Heavy();
        }else if(type == ArmorType.LIGHT){
            return new Light();
        }else if(type == ArmorType.MEDIUM){
            return new Medium();
        }
        return null;
    }

    Weapon getWeapon(WeaponType type){
        if(type == WeaponType.RIFLE){
            return new Rifle();
        }else if(type == WeaponType.PISTOL){
            return new Pistol();
        }else if(type == WeaponType.SWORD){
            return new Sword();
        }
        return null;
    }

    @Override
    public void onLocation(Character character) {
        System.out.println("Welcome to the shop!");
        System.out.println("What would you like to buy?");
        System.out.println("1. Armor");
        System.out.println("2. Weapon");
        System.out.println("3. Leave");
        int choice = getInput(1, 3);
        if(choice == 1){
            System.out.println("What type of armor would you like to buy?");
            System.out.println("1. Heavy");
            System.out.println("2. Light");
            System.out.println("3. Medium");
            choice = getInput(1, 3);
            Armor ar = null;
            if(choice == 1){
                ar = getArmor(ArmorType.HEAVY);
            }else if(choice == 2){
                ar = getArmor(ArmorType.LIGHT);
            }else if(choice == 3){
                ar = getArmor(ArmorType.MEDIUM);
            }
            if(character.getGold() >= ar.getGold()){
                character.setGold(character.getGold() - ar.getGold());
                character.setArmor(ar);
                System.out.println("You bought " + ar.getClass().getName() + " for " + ar.getGold() + " gold!");
            }else{
                System.out.println("You don't have enough gold!");
            }

        }else if(choice == 2){
            System.out.println("What type of weapon would you like to buy?");
            System.out.println("1. Rifle");
            System.out.println("2. Pistol");
            System.out.println("3. Sword");
            choice = getInput(1, 3);
            Weapon w = null;
            if(choice == 1){
                w = getWeapon(WeaponType.RIFLE);
            }else if(choice == 2){
                w = getWeapon(WeaponType.PISTOL);
            }else if(choice == 3){
                w = getWeapon(WeaponType.SWORD);
            }

            if(character.getGold() >= w.getGold()){
                character.setGold(character.getGold() - w.getGold());
                character.setWeapon(w);
                System.out.println("You bought " + w.getClass().getName() + " for " + w.getGold() + " gold!");
            }else{
                System.out.println("You don't have enough gold!");
            }
        }else if(choice == 3){
            System.out.println("You left the shop!");
        }
    }


}
