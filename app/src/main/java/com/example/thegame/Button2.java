package com.example.thegame;

import android.graphics.Color;
import android.widget.Toast;

public class Button2 extends MainActivity implements Buttons{

    private Levels lvl = new Levels();
    private int Coast;

    @Override
    public int Task1(int Money) {
        level = lvl.CheckLevel(Money);
        Coins = lvl.But2(level);
        return Coins;
    }

    @Override
    public int Task2(int Level) {
        HelpB2 Help = new  HelpB2();
        level = lvl.CheckLevel(Coins);
        Coast = Help.But2(level);
        return Coast;
    }

    @Override
    public String Task3(int Level) {
        btn2.setText("Откроется на уровне 2");
        btn2.setBackgroundColor(Color.GRAY);
        return Name;
    }


}
