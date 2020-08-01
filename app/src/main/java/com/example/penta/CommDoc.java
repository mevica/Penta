package com.example.penta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CommDoc extends AppCompatActivity {

     String data1;
     String data2;
     String data3;
     String data4;
    int images;

 TextView namedoc2,tvspecial2,tvepirience2,tvlocation2;
 ImageView docimg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_doc);


        setContentView(R.layout.activity_comm_doc);
        namedoc2=findViewById(R.id.namedoc2);
        tvspecial2=findViewById(R.id.tvspecial2);
        tvepirience2=findViewById(R.id.tvexpirience2);
        tvlocation2=findViewById(R.id.tvlocation2);
        docimg2=findViewById(R.id.docimg2);

        getData();
        setData();

    }

    private void setData() {
        if(getIntent().hasExtra("images") && getIntent().hasExtra("data1")&& getIntent().
                hasExtra("data2") && getIntent().hasExtra("data3")&& getIntent().hasExtra("data4")){
            data1=getIntent().getStringExtra("data1");
            data2=getIntent().getStringExtra("data2");
            data3=getIntent().getStringExtra("data3");
            data4=getIntent().getStringExtra("data4");
            images=getIntent().getIntExtra("images",1);
        }else{
            Toast.makeText(this, "no data", Toast.LENGTH_SHORT).show();
        }
    }

    private void getData() {
        namedoc2.setText(data1);
        tvspecial2.setText(data2);
        tvepirience2.setText(data3);
        tvlocation2.setText(data4);
        docimg2.setImageResource(images);
    }
}
