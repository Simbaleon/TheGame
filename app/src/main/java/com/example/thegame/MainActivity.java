package com.example.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


public class MainActivity extends AppCompatActivity {
  
    public static int Coins;
    public static int level = 1;
    private int seconds;
    public static boolean NewLevel;
    private boolean Finish;
    public String Name = "";
    public static int ClickB2, ClickB3, Click;
    public boolean ClB1, ClB2, ClB3;
    private int ForB2, ForB3;
    public static int ForB3Win;
    public static boolean ForB1Win;
    private String ForClickB2String, ForClickB3String, time;
    public Button btn1, btn2, btn3;
    private Drawable button3_off, button2_off;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Coins = 10;
        ForB3Win = 0;
        ForB1Win = false;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button1);
        btn1.setText("Заработок");
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        LevelsView(level);
        CoinsView(Coins);
        runTimer();
        addListenerOnButton();
        Finish = true;
        btn2.setText("Недоступно");
        btn2.setClickable(false);
        btn3.setText("Недоступно");
        btn3.setClickable(false);

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
                        level = L.CheckLevel(Coins);
                        LevelsView(level);
                        if (level == 10 && Finish) {
                            Fnsh();
                        } else


                        Coins = a.Task1(Coins);
                        level = L.CheckLevel(Coins);
                        LevelsView(level);
                        CoinsView(Coins);

                        if (ClickB2 < 15){ ClickB2 ++;}
                        if (ClickB3 < 30){ ClickB3 ++;}
                        if (ForB1Win){
                            ForButton1B();
                            ForB1Win = false;
                        }
                        if (NewLevel){
                            ForButton1A(a.Task3(level));
                            NewLevel = false;
                        }

                        ForButton2(level);
                        ForButton3(level);
                        Click ++;
                        if (level == 10 && Finish) {
                            Fnsh();
                        }

                    }
                });
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HelpB2 B1 = new HelpB2();
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Вы хотите потратить " + B1.But2(level) + "$ на лотерею? ")
                                .setCancelable(false)
                                .setPositiveButton("Да", new DialogInterface.OnClickListener(){
                                    @Override
                                    public void onClick (DialogInterface dialog, int which){
                                        Click++;
                                        ForB2++;
                                        ClB1 = false;
                                        ClB2 = true;
                                        ClB3 = false;

                                        Button2 b = new Button2();
                                        Levels L = new Levels();
                                        level = L.CheckLevel(Coins);
                                        LevelsView(level);
                                        CoinsView(Coins);

                                        if (level == 10 && Finish) {
                                            Fnsh();
                                        }else if (level < 2) {

                                        } else if (ClickB2 < 15) {
                                            ForButton2(level);
                                        } else if (Coins < b.Task2(level)) {
                                            Toast.makeText(
                                                    MainActivity.this, "Недостаточно средств (" + (b.Task2(level) - Coins) + " $)",
                                                    Toast.LENGTH_LONG
                                            ).show();
                                        } else {

                                            Coins = Coins - b.Task2(level) + b.Task1(Coins);
                                            level = L.CheckLevel(Coins);
                                            LevelsView(level);
                                            CoinsView(Coins);
                                            ForButton2(level);
                                            ForButton3(level);
                                            if (ClickB3 < 30) {
                                                ClickB3++;
                                            }
                                            ForButton2Win();

                                        }
                                    }
                                })
                                .setNegativeButton("Нет", new DialogInterface.OnClickListener(){
                                    @Override
                                    public void onClick (DialogInterface dialog, int which){
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("Лотерея");
                        alert.show();
                        if (level == 10 && Finish) {
                            Fnsh();
                        }
                    }

                });
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        HelpB2 B1 = new HelpB2();
                        AlertDialog.Builder a_builder = new AlertDialog.Builder(MainActivity.this);
                        a_builder.setMessage("Хотите ли вы рискнуть и удвоить свои " + Coins + "$ ?")
                                .setCancelable(false)
                                .setPositiveButton("Да", new DialogInterface.OnClickListener(){
                                    @Override
                                    public void onClick (DialogInterface dialog, int which){
                                        Click++;
                                        ForB3++;
                                        ClB1 = false;
                                        ClB2 = false;
                                        ClB3 = true;

                                        Button3 c = new Button3();
                                        Levels L = new Levels();
                                        level = L.CheckLevel(Coins);
                                        LevelsView(level);

                                        if (level == 10 && Finish) {
                                            Fnsh();
                                        }else if (level < 5) {
                                            ForButton3(level);
                                        } else {
                                            level = L.CheckLevel(Coins);
                                            Coins = c.Task1(Coins);
                                            LevelsView(level);
                                            CoinsView(Coins);
                                            ForButton2(level);
                                            ForButton3(level);

                                            if (ClickB2 < 15){ ClickB2 ++;}
                                        }
                                        ForButton3();
                                    }
                                })
                                .setNegativeButton("Нет", new DialogInterface.OnClickListener(){
                                    @Override
                                    public void onClick (DialogInterface dialog, int which){
                                        dialog.cancel();
                                    }
                                });
                        AlertDialog alert = a_builder.create();
                        alert.setTitle("Всё или ничего");
                        alert.show();
                        if (level == 10 && Finish) {
                            Fnsh();
                        }
                    }
                });
    }

    @SuppressLint("SetTextI18n")
    void LevelsView(int level) {
        TextView MyLevel = (TextView) findViewById(R.id.Level);
        String LevelString = Integer.toString(level);
        MyLevel.setText("Текущий уровень: " + LevelString);
    }

    @SuppressLint("SetTextI18n")
    void CoinsView(int Coins) {
        TextView MyCoins = (TextView) findViewById(R.id.Coins);
        String CoinsString = Integer.toString(Coins);
        MyCoins.setText("У вас " + CoinsString + " $");
    }

    void ForButton1A(String Work) {
        Toast.makeText(
                MainActivity.this, Work,
                Toast.LENGTH_SHORT
        ).show();

    }

    void ForButton1B() {
        Toast.makeText(
                MainActivity.this, "+ " + ForButton1.Znach + " $" ,
                Toast.LENGTH_SHORT
        ).show();
    }

    @SuppressLint("SetTextI18n")
    void ForButton2(int level) {
        if (ClickB2 < 15 && level > 1 && !ClB2){
            ForClickB2String = Integer.toString(15 - ClickB2);
            btn2.setBackgroundResource(R.drawable.button2_off);
            btn2.setTextSize(27);
            if (15 - ClickB2 == 1){
                btn2.setText("Доступно через 1 ход");
            btn2.setClickable(false);}
            else if (15 - ClickB2 < 5 && 15 - ClickB2 > 1){
                btn2.setText("Доступно через " + ForClickB2String + " хода");
                btn2.setClickable(false);}
            else {btn2.setText("Доступно через " + ForClickB2String + " ходов");
                btn2.setClickable(false);}
            btn2.setClickable(false);
            }else if (level > 1) {
            btn2.setBackgroundResource(R.drawable.button2_press);
            btn2.setTextSize(35);
            btn2.setText("Лотерея");

            btn2.setClickable(true);
            if (ClickB2 == 15 && ClB2){
                ClickB2 = 0;
                btn2.setText("Доступно через 15 ходов");
                btn2.setBackgroundResource(R.drawable.button2_off);
                btn2.setTextSize(27);
                btn2.setClickable(false);
            }
        }
    }

    @SuppressLint("SetTextI18n")
    void ForButton3(int level) {
        if (ClickB3 < 30 && level > 4 && !ClB3){
            ForClickB3String = Integer.toString(30 - ClickB3);
            btn3.setTextSize(27);
            if (30 - ClickB3 == 1){
                btn3.setText("Доступно через 1 ход");
                btn3.setClickable(false);
            }
            else if (30 - ClickB3 < 5 && 30 - ClickB3 > 1){
                btn3.setText("Доступно через " + ForClickB3String + " хода");
                btn3.setClickable(false);
            }
            else {
                btn3.setText("Доступно через " + ForClickB3String + " ходов");
                btn3.setClickable(false);
            }
            btn3.setBackgroundResource(R.drawable.button3_off);
            btn3.setClickable(false);
        }else if (level > 4 && ClickB3 == 30) {
            btn3.setText("Всё или ничего");
            btn3.setBackgroundResource(R.drawable.button3_press);
            btn3.setTextSize(35);
            btn3.setClickable(true);
            if (ClickB3 == 30 && ClB3){
                ClickB3 = 0;
                btn3.setText("Доступно через 30 ходов");
                btn3.setTextSize(27);
                btn3.setBackgroundResource(R.drawable.button3_off);
                btn3.setClickable(false);
            }
        }
    }
    void ForButton2Win(){
        ForButton2 Win = new ForButton2();
        if (ForButton2.Znach - ForButton2.Chance >= 0){
            Toast.makeText(
                    MainActivity.this, "Вы потеряли " + (ForButton2.Znach - ForButton2.Chance) + " $" ,
                    Toast.LENGTH_SHORT
            ).show();
        }else
            Toast.makeText(
                    MainActivity.this, "Вы выиграли  " + (ForButton2.Chance - ForButton2.Znach) + " $" ,
                    Toast.LENGTH_SHORT
            ).show();
    }

    void ForButton3(){
        if(Coins == 0){
            Toast.makeText(
                    MainActivity.this, "Вы проиграли :(" ,
                    Toast.LENGTH_SHORT
            ).show();
        }else Toast.makeText(
                MainActivity.this, "Вы выиграли :)" ,
                Toast.LENGTH_SHORT
        ).show();
    }
    private void runTimer(){
        final TextView score = (TextView) findViewById(R.id.time);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @SuppressLint("DefaultLocale")
            @Override
            public void run() {
                int h = seconds / 3600;
                int min = (seconds % 3600) / 60;
                int sec = seconds % 60;
                if (h == 0){
                    time = String.format("%d:%02d", min, sec);
                }else time = String.format("%d:%02d:%02d", h, min, sec);

                score.setText(time);
                seconds++;
                handler.postDelayed(this, 1000);
            }
        });
    }
    private void Fnsh(){
        AlertDialog.Builder finish = new AlertDialog.Builder(MainActivity.this);
        finish.setTitle("                     Be rich");
        finish .setMessage("  Поздравляю!!! Вы достигли цели. " + '\n' +
                "Ваше время: "  + time + '\n' +
                "Всего кликов: " + Click + '\n' +
                "Сыграно в лотерею: " + ForB2 + '\n' +
                "Сыграно в \"Всё или ничего\": " + ForB3 + " (Выиграно: " + ForB3Win + ")" + '\n' +
                "   Теперь вы можете продолжить игру без достижения уровней.");
        finish.setNegativeButton("Продолжить", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        AlertDialog alert = finish.create();
        alert.setCancelable(false);
        alert.show();
        Finish = false;
    }
    @Override
    public void onBackPressed(){
        try{
            Intent intent = new Intent (MainActivity.this, Menu.class);
            startActivity(intent); finish();
        }catch(Exception e){

        }
    }
}
