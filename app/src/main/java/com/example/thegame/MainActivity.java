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
    private int ClickB2, ClickB3;

    public Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Coins = 90;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setText("Заработок");
        btn1.setBackgroundColor(Color.GREEN);
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setText("Откроется на уровне 2");
        btn2.setBackgroundColor(Color.GRAY);
        btn3 = (Button)findViewById(R.id.button3);
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
                        Button1 a = new Button1();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);

                        Coins = a.Task1(Coins);
                        level = L.AddLevel(Coins);
                        LevelsView(level);
                        CoinsView(Coins);

                        ForButton1(a.Task3(level));
                        ForButton2(level);
                        ForButton3(level);

                    }
                });
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button2 b = new Button2();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);
                        CoinsView(Coins);
                        if (level < 2){

                        }else if (Coins < b.Task2(level)){
                            Toast.makeText(
                                    MainActivity.this, "Недостаточно средств",
                                    Toast.LENGTH_LONG
                            ).show();
                        }else {

                            Coins = Coins - b.Task2(level) + b.Task1(Coins);
                            level = L.AddLevel(Coins);
                            LevelsView(level);
                            CoinsView(Coins);
                            ForButton2(level);
                            ForButton3(level);
                        }
                    }
                });
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button3 c = new Button3();
                        Levels L = new Levels();
                        level = L.AddLevel(Coins);
                        LevelsView(level);

                        if (level < 5){

                        }else {
                            Coins = c.Task1(Coins);
                            level = L.AddLevel(Coins);
                            LevelsView(level);
                            CoinsView(Coins);
                            ForButton2(level);
                            ForButton3(level);
                        }
                    }
                });
    }
    void LevelsView(int level){
        TextView MyLevel = (TextView) findViewById(R.id.Level);
        String LevelString = Integer.toString(level);
        MyLevel.setText("Текущий уровень: " + LevelString);
    }
    void CoinsView(int Coins){
        TextView MyCoins = (TextView) findViewById(R.id.Coins);
        String CoinsString = Integer.toString(Coins);
        MyCoins.setText(CoinsString);
    }
    void ForButton1 (String Work){
        Toast.makeText(
                MainActivity.this, Work,
                Toast.LENGTH_SHORT
        ).show();
        }

    void ForButton2(int level){
        if (level > 1){
            btn2.setText("Лотерея");
            btn2.setBackgroundColor(Color.YELLOW);
        }
    }

    void ForButton3 (int level){
        if (level > 4){
            btn3.setText("Всё или ничего");
            btn3.setBackgroundColor(Color.RED);
        }
    }
}
