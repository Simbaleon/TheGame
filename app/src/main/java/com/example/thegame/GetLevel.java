package com.example.thegame;

public class GetLevel extends MainActivity {

    private int lvl  = 1;
    private  static int Proverka = 1;

    public int AddLevel(int Coins) {

        if (Coins < 100){
            lvl = 1;
        }else if (Coins >= 100 && Coins < 200){
            lvl = 2;
        }else if (Coins >= 200 && Coins < 400){
            lvl = 3;
        }else if (Coins >= 400 && Coins < 1000){
            lvl = 4;
        }else if (Coins >= 1000 && Coins < 5000){
            lvl = 5;
        }
        if (Proverka <= lvl){
            Proverka = lvl;
            level = lvl;
        }else {
            level = Proverka;
        }
        return level;
    }
}
