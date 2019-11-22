package com.example.thegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   public static int Coins = 90;
    static int level = 1, Koeff = 1;
    String Coin;

    public Button btn1, btn2, btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.button1);
        btn1.setText("Заработок");
        btn2 = (Button)findViewById(R.id.button2);
        btn2.setText("Лотерея");
        btn3 = (Button)findViewById(R.id.button3);
        btn3.setText("Всё или ничего");
        TextView MyCoins = (TextView) findViewById(R.id.Coins);
        String CoinsString = Integer.toString(Coins);
        MyCoins.setText(CoinsString);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Button1 a = new Button1();
                        Coins = a.Btn1(Coins);
                        TextView MyCoins = (TextView) findViewById(R.id.Coins);
                        String CoinsString = Integer.toString(Coins);
                        MyCoins.setText(CoinsString);
                    }
                });
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Buttons b = new Button2();
                        b.Btn2(Coins);
                        TextView MyCoins = (TextView) findViewById(R.id.Coins);
                        String CoinsString = String.valueOf(Coins);
                        MyCoins.setText(CoinsString);
                    }
                });
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Buttons c = new Button3();
                        c.Btn3(Coins);
                        TextView MyCoins = (TextView) findViewById(R.id.Coins);
                        String CoinsString = String.valueOf(Coins);
                        MyCoins.setText(CoinsString);
                    }
                });
    }

}
