package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.button.MaterialButton;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
 private TextInputLayout textInputUsername;
    private TextInputLayout textInputPassword;

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

private Boolean validateUsername() {
        String name = textInputUsername.getEditText().getText().toString();
        String noWhiteSpace = "\\A\\w{4,20}\\z";
        if (name.isEmpty()) {
            textInputUsername.setError("Field cannot be empty");
            return false;
        } else if (textInputUsername.getCounterMaxLength() >= 15) {
            textInputUsername.setError("Username too long");
            return false;
        } else if (name.matches(noWhiteSpace)) {
            textInputUsername.setError("White spaces are not allowed");
        } else {
            textInputUsername.setError(null);
            return false;
        }
        return null;
    }

    private Boolean validatePassword() {
        String name = textInputUsername.getEditText().getText().toString();

        String passwordVal = "^" +
                "(?=.*[a-zA-z])" +
                "(?=.*[@#$%^&+=])" +
                "(?=\\s+$)" +
                ".{4,}" +
                "$";

        if (name.isEmpty()) {
            textInputPassword.setError("Field cannot be empty");
            return false;
        } else if (!name.matches(passwordVal))
            textInputUsername.setError("Password is to weak");
        return false;
    }


    public void registerUser(View view) {
        if (!validateUsername() | !validatePassword()) {
            return;
        }

            String name = textInputUsername.getEditText().getText().toString();

        }
    }



