package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;

import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        textView2.setText(str + " dollars in pounds is...");
        String str2 = intent.getStringExtra("result");
        textView3.setText("£ " + str2);
    }
}
