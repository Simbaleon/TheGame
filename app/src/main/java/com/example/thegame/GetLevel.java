package com.example.thegame;

public class GetLevel {
    public int lvl  = MainActivity.level;
    public int AddLevel(int Coins) {
        if (Coins < 100){
            MainActivity.level = 1;
            lvl = 1;
            return lvl;
        }else if (Coins >= 100 && Coins < 200){
            MainActivity.level = 2;
            lvl = 2;
            return  MainActivity.level;
        }else if (Coins >= 200 && Coins < 400){
            MainActivity.level = 3;
            lvl = 3;
            return MainActivity.level;
        }else if (Coins >= 400 && Coins < 1000){
            MainActivity.level = 4;
            lvl = 4;
        }else if (Coins >= 1000 && Coins < 5000){
            MainActivity.level = 5;
            lvl = 5;
        }return MainActivity.level;
    }
}
