package com.example.thegame;

public class ForButton1 extends Pol_Znachenia {

    public static int Znach;
    private double Chance;
    private int ChanceInt;

    @Override
    public int For1(int Level) {
        switch (Level) {
            case 1: Znach = 10;
                break;
            case 2: Znach = 20;
                break;
            case 3: Znach = 40;
                break;
            case 4: Znach = 100;
                break;
            case 5: Znach = 250;
                break;
            case 6: Znach = 500;
                break;
            case 7: Znach = 1000;
                break;
            case 8: Znach = 1500;
                break;
            case 9: Znach = 2500;
                break;
            case 10: Znach = 5000;
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
            case 6: ChanceInt += 3;
            break;
            case 7: ChanceInt += 5;
            break;
            case 8: ChanceInt += 7;
            break;
            case 9: ChanceInt += 10;
            break;
            case 10: ChanceInt +=15;
            break;
        }
        if (ChanceInt > 400) {
            ForB1Win = true;
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
