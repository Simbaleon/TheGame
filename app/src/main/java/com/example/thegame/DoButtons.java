package com.example.thegame;
import static com.example.thegame.MainActivity.level;

public class DoButtons extends Levels implements Buttons {
    private Levels lvl = new Levels();
    private int BCoins = MainActivity.Coins;
    @Override
    public int Btn1(int Coins) {
        level = lvl.AddLevel(BCoins);
        MainActivity.Coins += lvl.AddLevel1(level);
        return MainActivity.Coins;
    }

    @Override
    public int Btn2(int level) {
        return 0;
    }

    @Override
    public int Btn3(int level) {
        return 0;
    }

}
