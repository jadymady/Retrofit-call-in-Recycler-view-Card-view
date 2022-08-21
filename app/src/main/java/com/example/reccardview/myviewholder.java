package com.example.reccardview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {

    ImageView dp;
    TextView nam,sub,college;

    public myviewholder(@NonNull View itemView) {
        super(itemView);
        dp=(itemView).findViewById(R.id.dp);
        nam=(itemView).findViewById(R.id.nam);
        sub=(itemView).findViewById(R.id.sub);
        college=(itemView).findViewById(R.id.college);

    }
}
