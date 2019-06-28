package com.example.asus.layoutest.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus.layoutest.R;

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {
    private Context mContext;
    public GridAdapter(Context context){
        this.mContext=context;
    }

    class LinearViewHolder extends  RecyclerView.ViewHolder{
        private TextView textView;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_title);

        }
    }
    @Override
    public LinearViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_recyclerview_item,viewGroup,false));

    }

    @Override
    public void onBindViewHolder(@NonNull LinearViewHolder linearViewHolder, int i) {
        linearViewHolder.textView.setText("Hello World");
    }

    @Override
    public int getItemCount() {

        return 30;
    }

}
