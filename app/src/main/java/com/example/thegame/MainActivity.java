package com.example.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static int Coins;
    public static int level = 1;
    public String Name = "";
    private int ClickB2, ClickB3, Click;
    private int ForClickB2, ForClickB3;
    private boolean ClB1, ClB2, ClB3;
    private String ForClickB2String, ForClickB3String;

    public Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Coins = 90;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setText("Заработок");
        btn1.setBackgroundColor(Color.GREEN);
        btn2 = (Button) findViewById(R.id.button2);
        btn2.setText("Откроется на уровне 2");
        btn2.setBackgroundColor(Color.GRAY);
        btn3 = (Button) findViewById(R.id.button3);
        btn3.setText("Откроется на уровне 5");
        btn3.setBackgroundColor(Color.GRAY);
        LevelsView(level);
        CoinsView(Coins);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ClB1 = true;
                        ClB2 = false;
                        ClB3 = false;
                        Click ++;
                        Button1 a = new Button1();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);


                        Coins = a.Task1(Coins);
                        level = L.AddLevel(Coins);
                        LevelsView(level);
                        CoinsView(Coins);

                        if (ClickB2 < 15){ ClickB2 ++;}
                        if (ClickB3 < 30){ ClickB3 ++;}
                        ForButton1(a.Task3(level));
                        ForButton2(level);
                        ForButton3(level);
                        Click ++;

                    }
                });
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Click ++;
                        ClB1 = false;
                        ClB2 = true;
                        ClB3 = false;
                        Button2 b = new Button2();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);
                        CoinsView(Coins);
                        if (level < 2) {

                        } else if(ClickB2 < 15){
                            ForButton2(level);
                        } else if (Coins < b.Task2(level)) {
                            Toast.makeText(
                                    MainActivity.this, "Недостаточно средств",
                                    Toast.LENGTH_LONG
                            ).show();
                        } else {

                            Coins = Coins - b.Task2(level) + b.Task1(Coins);
                            level = L.AddLevel(Coins);
                            LevelsView(level);
                            CoinsView(Coins);
                            ForButton2(level);
                            ForButton3(level);
                            if (ClickB3 < 30){ ClickB3 ++;}

                        }
                    }
                });
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Click++;
                        ClB1 = false;
                        ClB2 = false;
                        ClB3 = true;
                        Button3 c = new Button3();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);

                        if (level < 5) {
                            ForButton3(level);
                        } else {
                            Coins = c.Task1(Coins);
                            level = L.AddLevel(Coins);
                            LevelsView(level);
                            CoinsView(Coins);
                            ForButton2(level);
                            ForButton3(level);

                            if (ClickB2 < 15){ ClickB2 ++;}
                        }
                    }
                });
    }

    void LevelsView(int level) {
        TextView MyLevel = (TextView) findViewById(R.id.Level);
        String LevelString = Integer.toString(level);
        MyLevel.setText("Текущий уровень: " + LevelString);
    }

    void CoinsView(int Coins) {
        TextView MyCoins = (TextView) findViewById(R.id.Coins);
        String CoinsString = Integer.toString(Coins);
        MyCoins.setText(CoinsString);
    }

    void ForButton1(String Work) {
        Toast.makeText(
                MainActivity.this, Work,
                Toast.LENGTH_SHORT
        ).show();

    }

    void ForButton2(int level) {
        if (ClickB2 < 15 && level > 1 && !ClB2){
            ForClickB2String = Integer.toString(15 - ClickB2);
            if (15 - ClickB2 == 1)
                btn2.setText("Будет доступно через 1 ход");
            else if (15 - ClickB2 < 5 && 15 - ClickB2 > 1)
                btn2.setText("Будет доступно через " + ForClickB2String + " хода");
            else btn2.setText("Будет доступно через " + ForClickB2String + " ходов");
            btn2.setBackgroundColor(Color.GRAY);
            btn2.setClickable(false);
            }else if (level > 1) {
            btn2.setText("Лотерея");
            btn2.setBackgroundColor(Color.YELLOW);
            btn2.setClickable(true);
            if (ClickB2 == 15 && ClB2){
                ClickB2 = 0;
                btn2.setText("Будет доступно через 15 ходов");
                btn2.setBackgroundColor(Color.GRAY);
                btn2.setClickable(false);
            }
        }
    }

    void ForButton3(int level) {
        if (ClickB3 < 30 && level > 4 && !ClB3){
            ForClickB3String = Integer.toString(30 - ClickB3);
            if (30 - ClickB3 == 1)
                btn3.setText("Будет доступно через 1 ход");
            else if (30 - ClickB3 < 5 && 30 - ClickB3 > 1)
                btn3.setText("Будет доступно через " + ForClickB3String + " хода");
            else btn3.setText("Будет доступно через " + ForClickB3String + " ходов");
            btn3.setBackgroundColor(Color.GRAY);
            btn3.setClickable(false);
        }else if (level > 4) {
            btn3.setText("Всё или ничего");
            btn3.setBackgroundColor(Color.RED);
            btn3.setClickable(true);
            if (ClickB3 == 30 && ClB3){
                ClickB3 = 0;
                btn3.setText("Будет доступно через 30 ходов");
                btn3.setBackgroundColor(Color.GRAY);
                btn3.setClickable(false);
            }
        }
    }
}