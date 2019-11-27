package com.example.thegame;

public class Button1 extends MainActivity implements Buttons {


    private Levels lvl = new Levels();

    @Override
    public int Task1(int Coins) {
        level = lvl.CheckLevel(Coins);
        Coins += lvl.But1(level);
        return Coins;
    }

    @Override
    public int Task2(int Level) {

       return 0;

    }


    @Override
    public String Task3(int Level) {
        ForButton1 FB1 = new ForButton1();
        String name = FB1.For3(level);
        return name;
    }

}
