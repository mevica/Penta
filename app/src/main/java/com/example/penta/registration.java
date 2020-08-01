package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void movetologin(View view) {
        startActivity(new Intent(registration.this,login.class));
    }

    public void MovetoLogin(View view) {
        startActivity(new Intent(registration.this,login.class));

    }
}
