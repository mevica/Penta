package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void gotoreg(View view) {
        startActivity(new Intent(login.this,registration.class));
    }

    public void movetonav(View view) { startActivity(new Intent(login.this,Navigation.class));

    }
}
