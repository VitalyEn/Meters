package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class MeterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);
    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, MeterActivity.class);
        return intent;
    }
}