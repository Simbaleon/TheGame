package com.example.thegame;

public class Button1 extends MainActivity implements Buttons {


    private Levels lvl = new Levels();

    @Override
    public int Task1(int Coins) {
        level = lvl.AddLevel(Coins);
        Coins += lvl.But1(level);
        return Coins;
    }

    @Override
    public int Task2(int level) {
        return 0;
    }


    @Override
    public int Task3(int level) {
        return 0;
    }

}
