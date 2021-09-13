package com.example.testvideoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class LoginActivity extends AppCompatActivity {

    TextView textViewCreateAccountClick;
    ImageView landingScreenClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        landingScreenClick = findViewById(R.id.landingScreenAction);
        textViewCreateAccountClick = findViewById(R.id.textViewCreateAccount);

        textViewCreateAccountClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,CreateAccountActivity.class);
                startActivity(intent);

            }
        });
        landingScreenClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

    }
}
