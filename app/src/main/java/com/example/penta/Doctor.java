package com.example.penta;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Doctor extends AppCompatActivity {

    RecyclerView recyclerView2;

    String s1[],s2[],s3[],s4[];
    int images[]={R.drawable.doc,R.drawable.doc1,R.drawable.doc2,R.drawable.doc3,R.drawable.doc4,
            R.drawable.doc5,R.drawable.doc6,R.drawable.doc7,R.drawable.doc8,R.drawable.doc9,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor);

        recyclerView2=findViewById(R.id.recyclerview2);

        s1=getResources().getStringArray(R.array.docname);
        s2=getResources().getStringArray(R.array.specification);
        s3=getResources().getStringArray(R.array.experience);
        s4=getResources().getStringArray(R.array.doclocation);

        DocAdapter myAdaptor=new DocAdapter(s1, s2,s3,s4, images, this);
        recyclerView2.setAdapter(myAdaptor);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));
    }

    }
