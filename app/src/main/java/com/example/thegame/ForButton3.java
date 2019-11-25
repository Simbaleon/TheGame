package com.example.thegame;

import static com.example.thegame.MainActivity.Coins;

public class ForButton3 extends Pol_Znachenia {

    public int For1(int Level){
        Chance = 0;
        Chance = (int) (Math.random() * 1000);
        switch (Level){
            case 5: Chance += 10;
                break;
            case 6: Chance += 20;
             break;
            case 7: Chance += 30;
            break;
            case 8: Chance += 40;
            break;
            case 9: Chance += 50;
                    break;
            case 10: Chance += 70;
            break;
             default: Chance ++;
        }
        if (Chance > 750) {
            ForB3Win ++;
            return 2*Coins;
        }else {
            return 0;
        }
    }
    @Override
    public int For2(int Level){
        return Znach;
    }
    @Override
    public String For3 (int Level){
        return Name;
    }
}
