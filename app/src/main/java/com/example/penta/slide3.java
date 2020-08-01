package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class slide3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide3);
    }

    public void movetoslide4(View view) {
        startActivity(new Intent(slide3.this,slide4.class));
    }

    public void movetoSlide2(View view) {
        startActivity(new Intent(slide3.this,slide2.class));

    }
}
