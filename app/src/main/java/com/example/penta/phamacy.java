package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class phamacy extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[],s2[] ,s3[],s4[];
    int image[]={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,
            R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,R.drawable.o,
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phamacy);

        recyclerView=findViewById(R.id.recyclerview);


        s1=getResources().getStringArray(R.array.name);
        s2=getResources().getStringArray(R.array.location);

        MyAdaptor myAdaptor=new MyAdaptor(s1, s2, image, this);
        recyclerView.setAdapter(myAdaptor);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
