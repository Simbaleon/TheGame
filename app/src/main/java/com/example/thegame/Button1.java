package com.example.thegame;


import static com.example.thegame.MainActivity.Coins;

public class Button1 extends Levels implements Buttons {
    double Chance;
    int BCoins = MainActivity.Coins;
    @Override
    public int Btn1(int coins) {
        MainActivity.Coins = coins + LvLB1;
        return MainActivity.Coins;
    }

    @Override
    public int Btn2(int coins) {
        Chance = 0;
        Chance = Math.random();
        if (Chance > 0.95){
            BCoins = Coins + LvLB1;
            Coins = BCoins;
            return Coins;
        }else return BCoins;
    }

    @Override
    public int Btn3(int coins) {

        return 0;
    }
}
