package com.example.penta;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class MedAdaptor extends RecyclerView.Adapter<MedAdaptor.MyViewHolder> {
    private String data1[];
    private String data2[];
    private Context context;

    public MedAdaptor(String[] data1, String[] data2){
        this.data1 = data1;
        this.data2 = data2;

    }



    @NonNull
        @Override
        public MedAdaptor.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater=LayoutInflater.from(context);
            View view= inflater.inflate(R.layout.medrecycler,parent,false);
            return new MyViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.tvmed.setText(data1[position]);
            holder.tvksh.setText(data2[position]);
            holder.cardview.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                                  }
            });







        }

        @Override
        public int getItemCount() {
            return data1.length;
        }

        public static class MyViewHolder extends RecyclerView.ViewHolder {
            TextView tvmed,tvksh;
            Button btnorder;
            CardView cardview;


            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                tvmed=itemView.findViewById(R.id.tvmed);
                tvksh=itemView.findViewById(R.id.tvksh);
                btnorder=itemView.findViewById(R.id.btnorder);
                cardview=itemView.findViewById(R.id.cardview);

            }
        }
    }


