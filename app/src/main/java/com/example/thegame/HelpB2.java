package com.example.thegame;

public class HelpB2 extends Levels {
//  private
    public  int Money;
    @Override
    public int But2(int Level){
        ForButton2 FB2 = new ForButton2();
        Money = FB2.For1(Level);
        return Money;
    }

}
