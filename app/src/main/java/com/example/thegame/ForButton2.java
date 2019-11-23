package com.example.thegame;

public class ForButton2 extends Pol_Znachenia {

    @Override
    public int For1(int Level) {
        switch (MainActivity.level) {
            case 2:
                Znach = 100;
                break;
            case 3:
                Znach = 200;
                break;
            case 4:
                Znach = 400;
                break;
            case 5:
                Znach = 1000;
                break;
                default: Znach = -100;
        }
        return Znach;
    }

    @Override
    public int For2(int Level) {
        switch (MainActivity.level) {
            case 2:
                Chance = 50 + (int)(Math.random() * 100);
                break;
            case 3:
                Chance = 100 + (int)(Math.random() * 200);
                break;
            case 4:
                Chance = 200 + (int)(Math.random() * 400);
                break;
            case 5:
                Chance = 800 + (int)(Math.random() * 400);
                break;
                default: Chance = -100;
        }
        return Chance;
    }
}
