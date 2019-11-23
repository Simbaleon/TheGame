package com.example.thegame;

public class Levels extends GetLevel implements Prov {
    public int LvLB1, LvLB2,  LvLKoeff1, LvLChance1;
    public int Clicks;

    @Override
    public int AddLevel1(int level) {
        Clicks ++;
        ForButton1 FB1 = new ForButton1();
        LvLB1 = FB1.ForButtons1(level);
        if (level > 3){
            LvLB2 = FB1.ForButtons2(level);
        }
        if (LvLB2 == 0){
            return LvLB1;
        }else return LvLB2;
    }


    @Override
    public int AddLevel2(int Coins) {
        Clicks ++;
        return LvLB1;
    }

    @Override
    public int AddLevel3(int Coins) {
        Clicks ++;
        return 0;
    }

}
