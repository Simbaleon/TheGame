package com.example.thegame;

public class ForButton2 extends Pol_Znachenia {
    static int Znach = 0;

    @Override
    public int For1(int Level) {
        switch (Level) {
            case 2: Znach = 100;
                break;
            case 3: Znach = 250;
                break;
            case 4: Znach = 750;
                break;
            case 5: Znach = 1500;
                break;
            case 6: Znach = 10000;
                break;
            case 7: Znach = 50000;
                break;
            case 8: Znach = 300000;
                break;
            case 9: Znach = 1000000;
                break;
            case 10: Znach = 5000000;
                break;
                default: Znach = 100;

        }
        return Znach;
    }

    @Override
    public int For2(int Level) {
        Chance = 0;
        switch (Level) {
            case 2: Chance = 50 + (int)(Math.random() * 100);
                    break;
            case 3: Chance = 150 + (int)(Math.random() * 200);
                    break;
            case 4: Chance = 600 + (int)(Math.random() * 300);
                    break;
            case 5: Chance = 1200 + (int)(Math.random() * 600);
                    break;
            case 6: Chance = 8500 + (int)(Math.random() * 3000);
                    break;
            case 7: Chance = 45000 + (int)(Math.random() * 10000);
                     break;
            case 8: Chance = 250000 + (int)(Math.random() * 100000);
                    break;
            case 9: Chance = 900000 + (int)(Math.random() * 200000);
                    break;
            case 10: Chance = 45000000 + (int) (Math.random() * 5500000);
                    break;
                default: Chance = 100;
        }
        return Chance;
    }
    @Override
    public String For3(int Level){
        return Name;
    }
}
