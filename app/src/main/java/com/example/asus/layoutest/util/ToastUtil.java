package com.example.asus.layoutest.util;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.layoutest.R;

import java.util.zip.Inflater;

public class ToastUtil {
    public static Toast mToast;
    public static void shouMsg(Context context,String msg){
        mToast=new Toast(context);
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.layout_toast,null);
        mToast.setView(view);
        ImageView imageView=view.findViewById(R.id.iv_toast);
        TextView textView=view.findViewById(R.id.tv_toast);
        imageView.setImageResource(R.drawable.star);
        textView.setText(msg);
        mToast.setGravity(Gravity.CENTER,0,0);
        mToast.show();
    }
}
