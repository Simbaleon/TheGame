package com.example.thegame;

public class Button3 extends MainActivity implements Buttons{

    private Levels lvl = new Levels();

    @Override
    public int Task1(int Money) {
        level = lvl.AddLevel(Coins);
        Money = lvl.But3(level);
        return Money;
    }

    @Override
    public int Task2(int level) {
        return 0;
    }

    @Override
    public int Task3(int Coins) {
        return 0;
    }
}