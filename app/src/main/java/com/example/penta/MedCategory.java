package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MedCategory extends AppCompatActivity {

    //List<Med> lsMed;

     String data1;
    int image;

    ImageView phamimg2;
    TextView tvname2;

    String s1[],s2[];
    RecyclerView recyclerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_med_category);

        s1=getResources().getStringArray(R.array.medname);
        s2=getResources().getStringArray(R.array.cash);

        recyclerview=findViewById(R.id.recyclermed);

        MedAdaptor myAdaptor=new MedAdaptor(s1, s2);
        recyclerview.setAdapter(myAdaptor);
        recyclerview.setLayoutManager(new LinearLayoutManager(this));

//        lsMed=new ArrayList<>();
//        lsMed.add(new Med("Antiviral", 150));
//        lsMed.add(new Med("Antibacterial",1500));
//        lsMed.add(new Med("Losec",200));
//        lsMed.add(new Med("Actropid",450));
//        lsMed.add(new Med("Ciprobay",300));
//        lsMed.add(new Med("Bactrim",50));
//        lsMed.add(new Med("Brufen",70));
//        lsMed.add(new Med("Antiviral",150));
//        lsMed.add(new Med("Antibacterial",1500));
//        lsMed.add(new Med("Losec",250));
//        lsMed.add(new Med("Actropid",450));
//        lsMed.add(new Med("Ciprobay",300));
//        lsMed.add(new Med("Bactrim",50));
//        lsMed.add(new Med("Brufen",70));
//        lsMed.add(new Med("Keflex",150));
//
//        RecyclerView myrv=findViewById(R.id.recyclermed);
//        MedAdaptor myAdaptor=new MedAdaptor(lsMed, this);
//        myrv.setLayoutManager(new GridLayoutManager(this,2));
//        myrv.setAdapter(myAdaptor);


        setContentView(R.layout.activity_med_category);
        phamimg2=findViewById(R.id.phamimg2);
        tvname2=findViewById(R.id.tvname2);

        getData();
        setData();


    }
    private void getData(){
        if(getIntent().hasExtra("image") && getIntent().hasExtra("data1") ){
            data1=getIntent().getStringExtra("data1");
            image=getIntent().getIntExtra("image",1);
        }else{
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }

    }
    private void setData(){
        tvname2.setText(data1);
        phamimg2.setImageResource(image);

    }
}
