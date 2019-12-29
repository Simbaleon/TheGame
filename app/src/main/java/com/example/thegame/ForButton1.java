package com.example.thegame;

public class ForButton1 extends Get_value {

    public static int Znach;
    private double Chance;
    private int ChanceInt;

    @Override
    public int For1(int Level) {
        switch (Level) {
            case 1: Znach = 1;
                break;
            case 2: Znach = 2;
                break;
            case 3: Znach = 4;
                break;
            case 4: Znach = 10;
                break;
            case 5: Znach = 25;
                break;
            case 6: Znach = 50;
                break;
            case 7: Znach = 100;
                break;
            case 8: Znach = 150;
                break;
            case 9: Znach = 250;
                break;
            case 10: Znach = 500;
                break;
        }
        return Znach;
    }

    @Override
    public int For2(int Level) {
        Chance = 0;
        Chance = Math.random() * 1000;
        ChanceInt = (int)Chance;
        switch (Level){
            case 4: ChanceInt += 1;
            break;
            case 5: ChanceInt += 2;
            break;
            case 6: ChanceInt += 5;
            break;
            case 7: ChanceInt += 7;
            break;
            case 8: ChanceInt += 10;
            break;
            case 9: ChanceInt += 15;
            break;
            case 10: ChanceInt += 20;
            break;
        }
        if (ChanceInt > 950) {
            ForB1Win = true;
            return 2 * Znach;
        }else {
            return 0;
        }
    }

    public String For3(int level){
        String Name = "";
        switch (level){
            case 1: Name = "Вы ищите деньги по дому";
                     break;
            case 2: Name = "Вы ищите тайники";
                    break;
            case 3: Name = "Вы работаете промоутером";
                    break;
            case 4: Name = "Вы работаете уборщиком";
                    break;
            case 5: Name = "Вы работаете продавцом в магазине";
                    break;
            case 6: Name = "Вы пошли работать по специальности";
                     break;
            case 7: Name = "Вы становитесь ценным работником компании";
                    break;
            case 8: Name = "Вы становитесь начальником отдела ";
                    break;
            case 9: Name = "Вы становитесь директором компании";
                    break;
            case 10: Name = "Вы становитесь главным владельцем компании";
                    break;
        }
        return Name;
    }
}


