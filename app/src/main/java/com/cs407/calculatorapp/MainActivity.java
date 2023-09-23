package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickAdd(View view){

        Log.i("INFO", "Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.number1Input);
        EditText input2 = (EditText) findViewById(R.id.number2Input);

        String number1 = input1.getText().toString();
        String number2 = input2.getText().toString();

        Float resAdd = Float.parseFloat(number1) + Float.parseFloat(number2);

        goToActivity(Float.toString(resAdd));
    }

    public void clickSub(View view){

        Log.i("INFO", "Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.number1Input);
        EditText input2 = (EditText) findViewById(R.id.number2Input);

        String number1 = input1.getText().toString();
        String number2 = input2.getText().toString();

        Float resAdd = Float.parseFloat(number1) - Float.parseFloat(number2);

        goToActivity(Float.toString(resAdd));
    }

    public void clickMul(View view){

        Log.i("INFO", "Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.number1Input);
        EditText input2 = (EditText) findViewById(R.id.number2Input);

        String number1 = input1.getText().toString();
        String number2 = input2.getText().toString();

        Float resAdd = Float.parseFloat(number1) * Float.parseFloat(number2);

        goToActivity(Float.toString(resAdd));
    }

    public void clickDiv(View view){

        Log.i("INFO", "Button Pressed");
        EditText input1 = (EditText) findViewById(R.id.number1Input);
        EditText input2 = (EditText) findViewById(R.id.number2Input);


        String number1 = input1.getText().toString();
        String number2 = input2.getText().toString();

        if(Float.parseFloat(number2) == 0) {
            Toast.makeText(MainActivity.this, "Cannot divide by 0", Toast.LENGTH_LONG).show();
        }
        else {
            Float resAdd = Float.parseFloat(number1) / Float.parseFloat(number2);

            goToActivity(Float.toString(resAdd));
        }
    }

    public void goToActivity(String s) {

        //Toast.makeText(MainActivity.this, d, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this, CalculatorDisplay.class);
        intent.putExtra("result", s);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}