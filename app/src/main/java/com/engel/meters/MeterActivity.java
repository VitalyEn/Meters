package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MeterActivity extends AppCompatActivity {

    private static final String EXTRA_ADRESS = "adress";

    private TextView textViewAdress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

        initViews();
        setupAdress();
    }

    private void initViews(){
        textViewAdress = findViewById(R.id.textViewAdress);
    }

    private void setupAdress(){
        String adress = getIntent().getStringExtra(EXTRA_ADRESS);
        textViewAdress.setText(adress);
    }
    public static Intent newIntent(Context context, String adress){
        Intent intent = new Intent(context, MeterActivity.class);
        intent.putExtra(EXTRA_ADRESS, adress);
        return intent;
    }
}