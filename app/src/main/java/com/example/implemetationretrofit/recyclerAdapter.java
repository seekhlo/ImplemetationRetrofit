package com.example.implemetationretrofit;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.myViewHolder>{

    List<ObjectModel> data;

    public recyclerAdapter(List<ObjectModel> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
    holder.txt1.setText(data.get(position).getTitle());
    holder.txt2.setText(data.get(position).getUrl());
        Picasso.get().load(data.get(position).getThumbnailURL()).into(holder.img);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt1,txt2;
        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            img= itemView.findViewById(R.id.imageView);
            txt1 = itemView.findViewById(R.id.textView);
            txt2 = itemView.findViewById(R.id.textView2);
        }
    }
}




