package com.example.lab2_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunctionA(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        int number1 = Integer.parseInt(myTextField.getText().toString());
        int number2 = Integer.parseInt(myTextField2.getText().toString());
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(Double.toString(number1 + number2));
    }

    public void clickFunctionS(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        double number1 = Integer.parseInt(myTextField.getText().toString());
        double number2 = Integer.parseInt(myTextField2.getText().toString());
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(Double.toString(number1 - number2));
    }

    public void clickFunctionM(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        double number1 = Integer.parseInt(myTextField.getText().toString());
        double number2 = Integer.parseInt(myTextField2.getText().toString());
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(Double.toString(number1 * number2));
    }

    public void clickFunctionD(View view){
        EditText myTextField = (EditText) findViewById(R.id.int1);
        EditText myTextField2 = (EditText) findViewById(R.id.int2);
        double number1 = Integer.parseInt(myTextField.getText().toString());
        double number2 = Integer.parseInt(myTextField2.getText().toString());
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        goToActivity2(Double.toString(number1 / number2));
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
}