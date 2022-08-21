package com.example.reccardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class myadapter extends RecyclerView.Adapter<myviewholder>
{
    ArrayList<Model> data;
    Context context;

    public myadapter(ArrayList<Model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.nam.setText(data.get(position).getName());
        //holder.sub.setText((CharSequence) data.get(position).getSubjects());
        //holder.college.setText((CharSequence) data.get(position).getQualification());
        //holder.dp.setImageResource(data.get(position).getProfileImage());
        Picasso.with(context)
                .load(data.get(position).getProfileImage())
                .into(holder.dp);
    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
}
