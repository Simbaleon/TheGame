package com.example.thegame;

public class Levels extends GetLevel implements ForButtons {
    public int LvLB1, LvLB2;
    public int Clicks, PlCoins;

    @Override
    public int But1(int level) {
        Clicks ++;
        ForButton1 FB1 = new ForButton1();
        LvLB1 = FB1.For1(level);
        if (level > 3){
            LvLB2 = FB1.For2(level);
        }
        if (LvLB2 == 0){
            return LvLB1;
        }else return LvLB2;
    }


    @Override
    public int But2(int level) {
        ForButton2 FB2 = new ForButton2();
        PlCoins = FB2.For2(level);
        return PlCoins;
    }

    @Override
    public int But3(int level) {
        ForButton3 FB3 = new ForButton3();
        PlCoins = FB3.For1(level);
        return PlCoins;
    }

}
