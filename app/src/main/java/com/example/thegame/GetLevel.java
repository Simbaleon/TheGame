package com.example.thegame;

public class GetLevel extends MainActivity {

    private int lvl = 1;
    private static int Proverka = 1;


    public int CheckLevel(int Coins) {

        if (Coins < 100) {
            lvl = 1;
        } else if (Coins >= 100 && Coins < 250) {
            lvl = 2;
        } else if (Coins >= 250 && Coins < 750) {
            lvl = 3;
        } else if (Coins >= 750 && Coins < 1500) {
            lvl = 4;
        } else if (Coins >= 1500 && Coins < 10000) {
            lvl = 5;
        }else if (Coins >= 10000 && Coins < 50000){
            lvl = 6;
        } else if (Coins >= 50000 && Coins < 300000){
            lvl = 7;
        } else if (Coins >= 300000 && Coins < 1000000){
            lvl = 8;
        }else if (Coins >= 1000000 && Coins < 5000000){
            lvl = 9;
        } else if (Coins >= 5000000){
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

