package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int counterValue = 0;
    TextView counterDisplay;
    Button plusButton, minusButton, resetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterDisplay = findViewById(R.id.counterDisplay);
        plusButton = findViewById(R.id.plusButton);
        minusButton =  findViewById(R.id.minusButton);
        resetButton = findViewById(R.id.resetButton);

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue += 1;
                counterDisplay.setText(counterValue + "");
            }
        });

        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (counterValue != 0){
                    counterValue -= 1;
                    counterDisplay.setText(counterValue + "");
                }
                else{
                    Toast.makeText(MainActivity.this, "Minimum number reached", Toast.LENGTH_SHORT).show();
                }
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterValue = 0;
                counterDisplay.setText(counterValue + "");
            }
        });



    }

}