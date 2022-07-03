package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.button.MaterialButton;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    String alpahbets_upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String alphabets_lowerCase= "abcdefghijklmnopqrstuvwxyz";
    String sybmols= "@#$%^&*()_+";
    int[] numbers = {0,1,2,3,4,5,6,7,8,9};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username = (TextView) findViewById(R.id.signin);
        TextView password = (TextView) findViewById(R.id.password);
        MaterialButton loginInButton = (MaterialButton) findViewById(R.id.login);

        loginInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                    Toast.makeText(MainActivity.this, "Login Succesfully!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login failed!", Toast.LENGTH_LONG).show();


                }
            }


        });

    }
}

