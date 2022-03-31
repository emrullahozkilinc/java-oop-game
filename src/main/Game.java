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
        try{
            choose = sc.nextShort();
        }catch(InputMismatchException e){
            System.err.println("You must enter a number!");
        }
        switch(choose){
            case 1:player = new Samurai();break;
            case 2:player = new Archer();break;
            case 3:player = new Knight();break;
        }
        
        System.out.println(player.toString());
    }
}
