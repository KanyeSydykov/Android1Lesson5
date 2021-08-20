package com.example.android1lesson5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView nameItem;
    ImageView imageItem;


    public MainViewHolder(@NonNull  View itemView) {
        super(itemView);

        nameItem = itemView.findViewById(R.id.text_view_item_item_list);
        imageItem = itemView.findViewById(R.id.image_view_item_item_list);
    }

    public void onBind(ItemModel data){
       nameItem.setText(data.name);
       imageItem.setImageResource(data.image);
    }

}
