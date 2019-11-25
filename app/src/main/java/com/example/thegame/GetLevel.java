package com.example.thegame;

public class GetLevel extends MainActivity {

    private int lvl = 1;
    private static int Proverka = 1;


    public int CheckLevel(int Coins) {

        if (Coins < 100) {
            lvl = 1;
        } else if (Coins >= 100 && Coins < 200) {
            lvl = 2;
        } else if (Coins >= 200 && Coins < 400) {
            lvl = 3;
        } else if (Coins >= 400 && Coins < 1000) {
            lvl = 4;
        } else if (Coins >= 1000 && Coins < 5000) {
            lvl = 5;
        }else if (Coins >= 5000){
            lvl = 10;
        }
        if (Proverka < lvl) {
            NewLevel = true;
            Proverka = lvl;
            level = lvl;
            ClickB2 = 15;
            ClickB3 = 30;
        } else {
            NewLevel = false;
            level = Proverka;
        }
        return level;
    }


}

