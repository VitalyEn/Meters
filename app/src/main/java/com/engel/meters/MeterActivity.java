package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MeterActivity extends AppCompatActivity {

    private static final String EXTRA_ADRESS = "adress";

    private TextView textViewAdress;
    private EditText editTextNumber_1;
    private EditText editTextT1_1;
    private EditText editTextT2_1;
    private EditText editTextT_1;
    private Button buttonOnSave_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

        initViews();
        setupAdress();
    }

    private void initViews(){
        textViewAdress = findViewById(R.id.textViewAdress);
        editTextNumber_1 = findViewById(R.id.editTextNumber_1);
        editTextT1_1 = findViewById(R.id.editTextT1_1);
        editTextT2_1 = findViewById(R.id.editTextT2_1);
        editTextT_1 = findViewById(R.id.editTextT_1);
        buttonOnSave_1 = findViewById(R.id.buttonOnSave_1);
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