package com.example.thegame;

public class Button2 extends MainActivity implements Buttons{

    private Levels lvl = new Levels();
    private int Coast;

    @Override
    public int Task1(int Money) {
        MainActivity.level = lvl.AddLevel(MainActivity.Coins);
        MainActivity.Coins = lvl.But2(MainActivity.level);
        return MainActivity.Coins;
    }

    @Override
    public int Task2(int Level) {
        HelpB2 Help = new  HelpB2();
        MainActivity.level = lvl.AddLevel(MainActivity.Coins);
        Coast = Help.But2(MainActivity.level);
        return Coast;
    }

    @Override
    public int Task3(int Coins) {
        return 0;
    }
}
