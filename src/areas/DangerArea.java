package areas;

import chars.Character;
import main.Game;
import monster.Monster;

import static main.Game.getInput;

public abstract class DangerArea extends Area{

    Monster[] monster;

    void war(Character character, Monster[] monster){
        do{
            System.out.println("There are "+ monster.length+" monsters in this area.");
            System.out.println(monsterInfo(monster));
            System.out.println("1. Attack");
            System.out.println("2. Run");
            int choice = Game.getInput(1,2);
            boolean isFinish = true;
            if(choice == 1){
                for (Monster m : monster) {
                        m.setHp(m.getHp() - character.getDamage());
                        character.setHp(character.getHp() - (m.getDamage() - ((m.getDamage()-character.getBlock()<0)?0:character.getBlock())));
                        if (m.getHp() <= 0) {
                            System.out.println("You killed " + m.getClass().getSimpleName()+". And got "+ m.getGold()+" gold");
                            character.setGold(character.getGold() + m.getGold());
                        }else if(character.getHp() <= 0){
                            System.out.println("You died");
                            break;
                        }
                        if(m.getHp() > 0){
                            isFinish = false;
                        }
                }
            }else if(choice == 2){
                break;
            }
            if(isFinish){
                getItems(character);
                break;
            }
        }while (character.getHp() > 0 && monster[0].getHp() > 0);
    }

    @Override
    public void onLocation(Character character) {
        System.out.println("You are in a"+ character.getArea().getClass().getSimpleName()+".");
        System.out.println("1-) War with the monsters");
        System.out.println("2-) Go back");
        int choice = getInput(1,2);
        switch (choice) {
            case 1:war(character,monster);break;
            case 2:System.out.println("You out from area!");break;
        }
    }

    void getItems(Character character){
        if(character.checkItem()){
            System.out.println("You won!");
            System.exit(0);
        }
    }

    String monsterInfo(Monster[] monster){
        String info = "";
        for (Monster m : monster) {
            info += m.getClass().getSimpleName()+" : "+m.getHp()+"\n";
        }
        return info;
    }
}
