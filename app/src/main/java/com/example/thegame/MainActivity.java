package com.example.thegame;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.graphics.Color;
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
    AlertDialog.Builder D2, D3;
    Context ForD2, ForD3;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Coins = 90;
        ForB3Win = 0;
        ForB1Win = false;
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
        runTimer();
        addListenerOnButton();
        Finish = true;
        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.dialog_layout);
        Button button = (Button) dialog.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.setCancelable(false);
        dialog.setTitle("Проверка связи");
        dialog.show();
//        ForD2 = MainActivity.this;
//        String title = "Лотерея";
//        ForButton2 b1 = new ForButton2();
//        Levels L = new Levels();
//        level = L.CheckLevel(Coins);
//        String message = "Потратать " + b1.For1(L.CheckLevel(Coins)) + " на лотерею?";
//        String button1String = "Да";
//        String button2String = "Нет";
//        D2 = new AlertDialog.Builder(ForD2);
//        D2.setTitle(title);  // заголовок
//        D2.setMessage(message); // сообщение
//        D2.setPositiveButton(button1String, new OnClickListener() {
//            public void onClick(DialogInterface dialog, int arg1) {
//                Button2();
//            }
//        });
//        D2.setNegativeButton(button2String, new OnClickListener() {
//            public void onClick(DialogInterface dialog, int arg1) {
//
//            }
//        });
//        D2.setCancelable(true);
//        D2.setOnCancelListener(new OnCancelListener() {
//            public void onCancel(DialogInterface dialog) {
//                Toast.makeText(ForD2, "Вы ничего не выбрали",
//                        Toast.LENGTH_LONG).show();
//            }
//        });



    }

    public void addListenerOnButton() {

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
//                        if (NewGame){
//                            AlertDialog.Builder New = new AlertDialog.Builder(MainActivity.this);
//                            New.setTitle("     Be rich     ");
//                            New .setMessage("Цель вашей игры достигунть 10 уровня");
//                            New.setNegativeButton("Начать игру", new DialogInterface.OnClickListener() {
//                                                public void onClick(DialogInterface dialog, int id) {
//                                                    dialog.cancel();
//                                                }
//                                            });
//                            AlertDialog alert = New.create();
//                            alert.show();
//                            NewGame = false;
//                        }
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
                        a_builder.setMessage("Вы хотите потратить " + B1.But2(level) + " на лотерею? " + ForButton1.Znach)
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
                                                    MainActivity.this, "Недостаточно средств (" + b.Task2(level) + ")",
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
                        a_builder.setMessage("Хотите ли вы рискнуть и удвоить свои ")
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
        MyCoins.setText("Coins: " + CoinsString);
    }

    void ForButton1A(String Work) {
        Toast.makeText(
                MainActivity.this, Work,
                Toast.LENGTH_SHORT
        ).show();

    }

    void ForButton1B() {
        Toast.makeText(
                MainActivity.this, "+ " + ForButton1.Znach ,
                Toast.LENGTH_SHORT
        ).show();
    }
    @SuppressLint("SetTextI18n")
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

    @SuppressLint("SetTextI18n")
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
        finish.setTitle("     Be rich     ");
        finish .setMessage("Поздравляю!!! Вы достигли цели. Вы стали владельцем крупной фирмы и теперь " +
                "вы ни от чего не зависите. Теперь вы можете продолжить игру без достижения уровней."+ '\n' +
                "Ваше время: "  + time + '\n' +
                "Всего кликов: " + Click + '\n' +
                "Сыграно в лотрею: " + ForB2 + '\n' +
                "Сыграно в \"Всё или ничего\": " + ForB3 + " (Выиграно: " + ForB3Win + ")");
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

}
