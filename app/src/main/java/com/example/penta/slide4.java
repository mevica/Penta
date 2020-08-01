package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class slide4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide4);
    }

    public void movetoregister(View view) {
       startActivity(new Intent(slide4.this,registration.class));
    }

    public void movetoslide3(View view) {
        startActivity(new Intent(slide4.this,slide3.class));

    }
}
