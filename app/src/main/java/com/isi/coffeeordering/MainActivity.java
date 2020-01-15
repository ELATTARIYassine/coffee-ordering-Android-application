package com.isi.coffeeordering;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int blackcoffe = 0;
    private int milkShake = 0;
    private int greenTea = 0;
    private boolean resetCoffePrice = false;
    private boolean resetMilkShakePrice = false;
    private boolean resetGreenTeaPrice = false;
    private int blackCoffePrice = 15;
    private int milkShakePrice = 25;
    private int greenTeaPrice = 10;
    private String fullPrice;
    private String e;
    private TextView blackCoffeTextView;
    private TextView milkShakeTextView;
    private TextView greenTeaTextView;
    private TextView textViewCheckout;
    private int somme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blackCoffeTextView = findViewById(R.id.black_coffe_counter);
        milkShakeTextView = findViewById(R.id.milk_shake_counter);
        greenTeaTextView = findViewById(R.id.green_tea_counter);
        textViewCheckout = findViewById(R.id.textViewCheckout);
    }

    public void onBlackCoffeClick(View view) {

        if(resetCoffePrice != true)
        {
            blackcoffe++;
            blackCoffeTextView.setText(Integer.toString(blackcoffe));
        }
        else
        {
            blackcoffe = 0;
            blackcoffe++;
            blackCoffeTextView.setText(Integer.toString(blackcoffe));
            resetCoffePrice = false;
        }
    }

    public void onMilkShakeClick(View view) {
        if (resetMilkShakePrice != true)
        {
            milkShake++;
            milkShakeTextView.setText(Integer.toString(milkShake));
        }
        else
            {
                milkShake = 0;
                milkShake++;
                milkShakeTextView.setText(Integer.toString(milkShake));
                resetMilkShakePrice = false;
            }
    }

    public void onGreenTeaClick(View view) {
        if (resetGreenTeaPrice != true)
        {
            greenTea++;
            greenTeaTextView.setText(Integer.toString(greenTea));
        }
        else
        {
            greenTea = 0;
            greenTea++;
            greenTeaTextView.setText(Integer.toString(greenTea));
            resetGreenTeaPrice = false;
        }

    }

    public void onCheckOut(View view) {
        blackcoffe = Integer.parseInt(blackCoffeTextView.getText().toString());
        greenTea = Integer.parseInt(greenTeaTextView.getText().toString());
        milkShake = Integer.parseInt(milkShakeTextView.getText().toString());
        somme = greenTea * greenTeaPrice + blackcoffe * blackCoffePrice + milkShake * milkShakePrice;
        fullPrice = Integer.toString(somme)+" Dhs";
        textViewCheckout.setText(fullPrice);
    }

    public void onBlackCoffeResetClick(View view) {
        resetCoffePrice = true;
        blackCoffeTextView.setText(Integer.toString(0));
    }

    public void onGreenTeaResetClick(View view) {
        resetGreenTeaPrice = true;
        greenTeaTextView.setText(Integer.toString(0));
    }

    public void onMilkShakeResetClick(View view) {
        resetMilkShakePrice = true;
        milkShakeTextView.setText(Integer.toString(0));
    }
}
