package com.example.practical_13;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView text;
    public MainActivity(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.im_feelings_item);
        text=itemView.findViewById(R.id.tv_feelings_title);
    }
}