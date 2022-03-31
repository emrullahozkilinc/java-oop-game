package areas;

import armor.*;

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

}
