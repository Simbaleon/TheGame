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
        int Chance = 0;
        switch (level){
            case 1: Chance = (int) (1 + Math.random() * 4);
                switch(Chance){
                    case 1: Name = "*поиск по углам*";
                        break;
                    case 2: Name = " посмотреть в копилку";
                        break;
                    case 3: Name = " *поиск в карманах*";
                        break;
                    case 4: Name = " помыть машину";
                        break;
                    case 5: Name = "*поиск на улице*";
                        break;
                } break;
            case 2: Chance = (int) (1 + Math.random() * 4);
                switch(Chance){
                    case 1: Name = "помочь бабушке";
                        break;
                    case 2: Name = "помочь маме";
                        break;
                    case 3: Name = "помочь отцу";
                        break;
                    case 4: Name = "забрать долг у друга";
                        break;
                    case 5: Name = "взять заначку";
                        break;
                } break;
        }
        return Name;
    }
}
