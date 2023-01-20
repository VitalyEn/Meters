package com.engel.meters;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MeterActivity extends AppCompatActivity {

    private static final String EXTRA_ADRESS = "adress";

    private TextView textViewAdress;
    private EditText editTextNumber_1;
    private EditText editTextT1_1;
    private EditText editTextT2_1;
    private EditText editTextT_1;
    private Button buttonOnSave_1;
    private TextView saveMessageTextView_1;

    private MeterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter);

        viewModel = new ViewModelProvider(this).get(MeterViewModel.class);
        viewModel.getShouldCloseScreen().observe(this, shouldClose -> {
            if(shouldClose){
                finish();
            }
        });

        initViews();
        setupAdress();
        loadMeterFromDB();

        buttonOnSave_1.setOnClickListener(view -> {
            saveMeter();
            saveMessageTextView_1.setVisibility(View.VISIBLE);
            buttonOnSave_1.setVisibility(View.GONE);
        });
    }

    private void initViews(){
        textViewAdress = findViewById(R.id.textViewAdress);
        editTextNumber_1 = findViewById(R.id.editTextNumber_1);
        editTextT1_1 = findViewById(R.id.editTextT1_1);
        editTextT2_1 = findViewById(R.id.editTextT2_1);
        editTextT_1 = findViewById(R.id.editTextT_1);
        buttonOnSave_1 = findViewById(R.id.buttonOnSave_1);
        saveMessageTextView_1 = findViewById(R.id.saveMessageTextView_1);
    }

    private void setupAdress(){
        String adress = getIntent().getStringExtra(EXTRA_ADRESS);
        textViewAdress.setText(adress);
    }

    private void loadMeterFromDB(){
        List<Meter> meters;
        meters = viewModel.loadMeters();
        if(!meters.isEmpty()) {
            editTextNumber_1.setText(meters.get(0).getId());
            meters.get(0).getT1_tariff();
            meters.get(0).getT2_tariff();
            meters.get(0).getT_tariff();
        }
    }
    private void saveMeter(){
        int id = Integer.parseInt(editTextNumber_1.getText().toString().trim());
        String adress = textViewAdress.getText().toString();
        int t1 = Integer.parseInt(editTextT_1.getText().toString().trim());
        int t2 = Integer.parseInt(editTextT2_1.getText().toString().trim());
        int t = Integer.parseInt(editTextT_1.getText().toString().trim());
        Meter meter = new Meter(id,adress,t1,t2,t);
        viewModel.saveMeter(meter);
    }

    public static Intent newIntent(Context context, String adress){
        Intent intent = new Intent(context, MeterActivity.class);
        intent.putExtra(EXTRA_ADRESS, adress);
        return intent;
    }
}