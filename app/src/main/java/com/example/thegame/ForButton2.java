package com.example.thegame;

import static com.example.thegame.MainActivity.level;

public class ForButton2 extends Pol_Znachenia {
    private int Znach = 0;

    @Override
    public int For1(int Level) {
        switch (Level) {
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
            case 6: Znach = 2500;
            break;

        }
        return Znach;
    }

    @Override
    public int For2(int Level) {
        Chance = 0;
        switch (level) {
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
    @Override
    public String For3(int Level){
        return Name;
    }
}
