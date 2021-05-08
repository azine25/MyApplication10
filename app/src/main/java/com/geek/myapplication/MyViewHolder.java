package com.geek.myapplication;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv);
        textView2 = itemView.findViewById(R.id.description);
        textView3 = itemView.findViewById(R.id.heading);
        textView4 = itemView.findViewById(R.id.number);

    }

    public void onBind(cttd s) {
        textView.setText(s.getData());
        textView.setText(s.getDescription());
        textView.setText(s.getHeading());
        textView.setText(s.getNumber());
    }
}
