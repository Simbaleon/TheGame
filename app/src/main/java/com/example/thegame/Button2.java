package com.example.thegame;

public class Button2 extends MainActivity implements Buttons{

    private Levels lvl = new Levels();
    private int Coast;

    @Override
    public int Task1(int Money) {
        level = lvl.AddLevel(Money);
        Coins = lvl.But2(level);
        return Coins;
    }

    @Override
    public int Task2(int Level) {
        HelpB2 Help = new  HelpB2();
        level = lvl.AddLevel(Coins);
        Coast = Help.But2(level);
        return Coast;
    }

    @Override
    public int Task3(int Coins) {
        return 0;
    }
}
