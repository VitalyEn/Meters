package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonMeter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        buttonMeter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = MeterActivity.newIntent(MainActivity.this,
                        buttonMeter1.getText().toString());
                startActivity(intent);
            }
        });
    }

    private void initViews(){
        buttonMeter1 = findViewById(R.id.button1);
    }
}