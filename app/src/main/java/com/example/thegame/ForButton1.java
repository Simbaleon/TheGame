package com.example.thegame;

public class ForButton1 extends Pol_Znachenia {

    private int Znach;
    private double Chance;
    private int ChanceInt;

    @Override
    int ForButtons1(int Level) {
        switch (Level) {
            case 1:
                Znach = 10;
                break;
            case 2:
                Znach = 20;
                break;
            case 3:
                Znach = 40;
                break;
            case 4:
                Znach = 100;
                break;
            case 5:
                Znach = 250;
        }
        return Znach;
    }

    @Override
    int ForButtons2(int Level) {
        Chance = 0;
        Chance = Math.random() * 600;
        ChanceInt = (int)Chance;
        switch (Level){
            case 4: ChanceInt += 1;
            break;
            case 5: ChanceInt += 2;
            break;
        }
        if (ChanceInt > 590) {
            return 2 * Znach;
        }else {
            return 0;
        }

    }
}
