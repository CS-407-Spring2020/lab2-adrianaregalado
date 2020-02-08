package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import android.view.View;

import android.widget.EditText;

import android.widget.Toast;

import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        double value = Double.parseDouble(str);
        goToActivity2(value);

        // Toast.makeText( MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void goToActivity2(double value) {

        Intent intent = new Intent ( this, Main2Activity.class);
        intent.putExtra("message",  value + "");
        double conversion = value * 0.77;
        double rounded = Math.round(conversion * 100.0) / 100.0;
        intent.putExtra("result", rounded + "");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
