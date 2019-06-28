package com.example.asus.layoutest.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.asus.layoutest.R;

public class StaggeredGridAdapter extends RecyclerView.Adapter<StaggeredGridAdapter.LinearViewHolder> {
    private Context mContext;
    public StaggeredGridAdapter(Context context){
        this.mContext=context;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{
        private ImageView imageView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.iv);

        }
    }
    @Override
    public LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_staggeredview_item,viewGroup,false));

    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder linearViewHolder, int i) {
        if (i%2!=0){
            linearViewHolder.imageView.setImageResource(R.drawable.pic1);
        }else {
            linearViewHolder.imageView.setImageResource(R.drawable.pic3);
        }

    }

    @Override
    public int getItemCount() {

        return 30;
    }

}
