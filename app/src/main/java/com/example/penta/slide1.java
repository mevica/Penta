package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class slide1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide1);
    }

    public void movetoslide2(View view) {
        startActivity(new Intent(slide1.this,slide2.class));

    }

    public void movetoMain(View view) {
        startActivity(new Intent(slide1.this,Navigation.class));
    }
}
