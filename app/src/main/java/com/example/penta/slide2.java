package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class slide2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide2);
    }

    public void movetoslide3(View view) {
        startActivity(new Intent(slide2.this,slide3.class));
    }

    public void movetoslide1(View view) {
        startActivity(new Intent(slide2.this,slide1.class));

    }
}
