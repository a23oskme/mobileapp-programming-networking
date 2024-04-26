package com.example.networking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    Context context;
    ArrayList<Mountain> mountainList;

    public RecyclerViewAdapter(Context context, ArrayList<Mountain> mountainList) {
        this.context = context;
        this.mountainList = mountainList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // inflate layout
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, viewGroup, false);
        return new RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder myViewHolder, int position) {
        myViewHolder.textView.setText(mountainList.get(position).getName());
        myViewHolder.locationView.setText(mountainList.get(position).getLocation());
        myViewHolder.heightView.setText(mountainList.get(position).getHeight().toString());
    }

    @Override
    public int getItemCount() {
        return mountainList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        TextView locationView;
        TextView heightView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            locationView = itemView.findViewById(R.id.locationView);
            heightView = itemView.findViewById(R.id.heightView);

        }
    }
}
