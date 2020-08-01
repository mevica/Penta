package com.example.penta;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdaptor extends RecyclerView.Adapter<MyAdaptor.MyViewHolder> {


    private String data1[];
    private String data2[];
    private int image[];
    private Context context;

    public MyAdaptor(String[] data1, String[] data2, int[] image, Context context) {
        this.data1 = data1;
        this.data2 = data2;
        this.image = image;
        this.context = context;
    }



    @NonNull
    @Override
    public MyAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view= inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        holder.tvname.setText(data1[position]);
        holder.tvlocation.setText(data2[position]);
        holder.phamimg.setImageResource(image[position]);
        holder.myrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MedCategory.class);
                intent.putExtra("data1",data1[position]);
                intent.putExtra("image",image[position]);
                context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return image.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        TextView tvname,tvlocation;
        ImageView phamimg;
        CardView myrow;

        Context context;
        int[] image;
        String[] data1;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvname=itemView.findViewById(R.id.tvname);
            tvlocation=itemView.findViewById(R.id.tvlocation);
            myrow=itemView.findViewById(R.id.myrow);
            phamimg=itemView.findViewById(R.id.phamimg);




        }


    }
}
