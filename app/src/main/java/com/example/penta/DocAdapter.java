package com.example.penta;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class DocAdapter extends RecyclerView.Adapter<DocAdapter.MyViewHolder> {



    private String data1[];
    private String data2[];
    private String data3[];
    private String data4[];
    private int images[];
    private Context context;

    public DocAdapter(String[] data1, String[] data2, String[] data3, String[] data4, int[] images,Context context) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4= data4;
        this.images = images;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.docrecycler,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.docname.setText(data1[position]);
        holder.tvspecial.setText(data2[position]);
        holder.tvexpirience.setText(data3[position]);
        holder.tvlocation.setText(data4[position]);
        holder.docimg.setImageResource(images[position]);
        holder.doccard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(context,CommDoc.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("data2",data2[position]);
                intent.putExtra("data3",data3[position]);
                intent.putExtra("data4",data4[position]);
                intent.putExtra("images",images[position]);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
                TextView docname,tvspecial,tvexpirience,tvlocation;
                ImageView docimg;
                CardView doccard;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            docname=itemView.findViewById(R.id.namedoc);
            tvspecial=itemView.findViewById(R.id.tvspecial);
            tvexpirience=itemView.findViewById(R.id.tvexpirience);
            tvlocation=itemView.findViewById(R.id.tvlocation);
            docimg=itemView.findViewById(R.id.docimg);
            doccard=itemView.findViewById(R.id.doccard);
        }
    }
}
