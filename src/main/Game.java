package main;

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
        
        System.out.println(player.toString());
    }



    public static short getInput(int min, int max){
        short choose = 0;
        try{
            choose = new Scanner(System.in).nextShort();
            if(choose < min || choose > max)
                throw new InputMismatchException();
        }catch(InputMismatchException e){
            System.out.println("Invalid input, try again");
            choose = getInput(min, max);
        }
        return choose;
    }
}
