package com.example.thegame;

public class Button1 extends MainActivity implements Buttons {


    private Levels lvl = new Levels();
    private int BCoins = MainActivity.Coins;
    @Override
    public int Btn1(int Coins) {
        level = lvl.AddLevel(BCoins);
        MainActivity.Coins += lvl.AddLevel1(level);
        return MainActivity.Coins;
    }

    @Override
    public void Btn2() {

    }

    @Override
    public int Btn3(int level) {
        return 0;
    }

}
