package main;

import areas.*;
import chars.*;
import chars.Character;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        short choose = 0;
        Character player = null;

        System.out.println("Choose a character;");
        System.out.println("1-)Samurai");
        System.out.println("2-)Archer");
        System.out.println("3-)Knight");

        choose = getInput(1, 3);

        switch(choose){
            case 1:player = new Samurai();break;
            case 2:player = new Archer();break;
            case 3:player = new Knight();break;
        }
        while (true) {
            go(player);
        }
    }

    public static void go(Character player){

        System.out.println("Where do you want to go?");
        System.out.println("1-)Cave");
        System.out.println("2-)Jungle");
        System.out.println("3-)River");
        System.out.println("4-)Shop");
        System.out.println("5-)Safe Zone");

        short choose = getInput(1, 5);

        switch(choose){
            case 1:player.setArea(new Cave());break;
            case 2:player.setArea(new Jungle());break;
            case 3:player.setArea(new River());break;
            case 4:player.setArea(new Shop());break;
            case 5:player.setArea(new SafetyHome());break;
        }

        player.getArea().onLocation(player);

        System.out.println(player.toString());
    }


    public static short getInput(int min, int max){
        short choose = 0;
        do{
            try{
                choose = new Scanner(System.in).nextShort();
                if(choose < min || choose > max)
                    throw new InputMismatchException();
            }catch(InputMismatchException e){
                System.out.println("Invalid input, try again");
            }
        }while(choose < min || choose > max);

        return choose;
    }
}
