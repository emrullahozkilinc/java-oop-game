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
            if(choice == 1){
                System.out.println("You bought a heavy armor!");
                character.setArmor(getArmor(ArmorType.HEAVY));
            }else if(choice == 2){
                System.out.println("You bought a light armor!");
                character.setArmor(getArmor(ArmorType.LIGHT));
            }else if(choice == 3){
                System.out.println("You bought a medium armor!");
                character.setArmor(getArmor(ArmorType.MEDIUM));
            }
        }else if(choice == 2){
            System.out.println("What type of weapon would you like to buy?");
            System.out.println("1. Rifle");
            System.out.println("2. Pistol");
            System.out.println("3. Sword");
            choice = getInput(1, 3);
            if(choice == 1){
                System.out.println("You bought a rifle!");
                character.setWeapon(getWeapon(WeaponType.RIFLE));
            }else if(choice == 2){
                System.out.println("You bought a pistol!");
                character.setWeapon(getWeapon(WeaponType.PISTOL));
            }else if(choice == 3){
                System.out.println("You bought a sword!");
                character.setWeapon(getWeapon(WeaponType.SWORD));
            }
        }else if(choice == 3){
            System.out.println("You left the shop!");
            go(character);
        }
    }
}
