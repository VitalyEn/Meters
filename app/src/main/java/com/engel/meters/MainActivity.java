package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonMeter1;
    private Button buttonMeter2;
    private Button buttonMeter3;
    private Button buttonMeter4;
    private Button buttonMeter5;
    private Button buttonMeter6;
    private Button buttonMeter7;
    private Button buttonMeter8;
    private Button buttonMeter9;
    private Button buttonMeter10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        buttonMeter1.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter1.getText().toString());
            startActivity(intent);
        });
        buttonMeter2.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter2.getText().toString());
            startActivity(intent);
        });
        buttonMeter3.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter3.getText().toString());
            startActivity(intent);
        });
        buttonMeter4.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter4.getText().toString());
            startActivity(intent);
        });
        buttonMeter5.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter5.getText().toString());
            startActivity(intent);
        });
        buttonMeter6.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter6.getText().toString());
            startActivity(intent);
        });
        buttonMeter7.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter7.getText().toString());
            startActivity(intent);
        });
        buttonMeter8.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter8.getText().toString());
            startActivity(intent);
        });
        buttonMeter9.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter9.getText().toString());
            startActivity(intent);
        });
        buttonMeter10.setOnClickListener(view -> {
            Intent intent = MeterActivity.newIntent(MainActivity.this,
                    buttonMeter10.getText().toString());
            startActivity(intent);
        });
    }

    private void initViews(){
        buttonMeter1 = findViewById(R.id.button1);
        buttonMeter2 = findViewById(R.id.button2);
        buttonMeter3 = findViewById(R.id.button3);
        buttonMeter4 = findViewById(R.id.button4);
        buttonMeter5 = findViewById(R.id.button5);
        buttonMeter6 = findViewById(R.id.button6);
        buttonMeter7 = findViewById(R.id.button7);
        buttonMeter8 = findViewById(R.id.button8);
        buttonMeter9 = findViewById(R.id.button9);
        buttonMeter10 = findViewById(R.id.button10);
    }
}