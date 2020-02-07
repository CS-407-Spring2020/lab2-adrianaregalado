package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.editText);
        String str = myTextField.getText().toString();
        goToActivity2(str);

        // Toast.makeText( MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
    }

    public void goToActivity2(String s) {

        Intent intent = new Intent ( this, Main2Activity.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
