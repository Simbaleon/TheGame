package com.example.thegame;

import static com.example.thegame.MainActivity.Coins;
import static com.example.thegame.MainActivity.level;

public class Levels{
    public static int LvLB1 = 1, LvLKoeff1 = 1, LvLChance1 = 1;
    private void Addlevel(){
        if (Coins < 100){
            level = 1;
            LvLB1 = 1;
            LvLKoeff1 = 1;
            LvLChance1 = 1;
        }
        if (Coins >= 100 && Coins < 200){
             level = 2;
             LvLB1 = 2;
             LvLKoeff1 = 2;
             LvLChance1 = 2;
        }else if (Coins >= 200 && Coins < 400){
            level = 3;
            LvLB1 = 5;
            LvLKoeff1 = 2;
            LvLChance1 = 2;
        }
    }
}

