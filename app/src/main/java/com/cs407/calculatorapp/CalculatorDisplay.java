package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CalculatorDisplay extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_display);
        textView=(TextView) findViewById(R.id.numDisplay);
        Intent intent = getIntent();
        String str = intent.getStringExtra("result");
        textView.setText(str);
    }
}