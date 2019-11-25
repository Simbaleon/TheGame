package com.example.thegame;

public class ForButton1 extends Pol_Znachenia {

    private int Znach;
    private double Chance;
    private int ChanceInt;

    @Override
    public int For1(int Level) {
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
                break;
            case 10: Znach = 999;
                break;
        }
        return Znach;
    }

    @Override
    public int For2(int Level) {
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

    public String For3(int level){
        String Name = "";
        switch (level){
            case 1: Name = "";
                     break;
            case 2: Name = "Вы помогате родителям за деньги";
                    break;
            case 3: Name = "Вы работаете промоутером";
                    break;
            case 4: Name = "";
                    break;
            case 5: Name = "";
                    break;
            case 6: Name = "";
                     break;
            case 7: Name = "";
                    break;
            case 8: Name = "";
                    break;
            case 9: Name = "";
                    break;
            case 10: Name = "";
                    break;
        }
        return Name;
    }
}
