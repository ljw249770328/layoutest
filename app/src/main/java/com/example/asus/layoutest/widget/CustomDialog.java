package com.example.asus.layoutest.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import com.example.asus.layoutest.R;

public class CustomDialog extends Dialog implements View.OnClickListener {
    private TextView mTvTitle,mTvMessage,mTvCancle,mTvConfirm;
    private String title,message,cancle,confirm;
    private IOnCancelListener cancelListener;
    private IOnConfirmListener confirmListener;
    public CustomDialog(@NonNull Context context) {
        super(context);
    }
    public CustomDialog(@NonNull Context context, int themeId) {
        super(context);
    }
    public CustomDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CustomDialog setMessage(String message) {
        this.message = message;
        return this;
    }

    public CustomDialog setCancle(String cancle,IOnCancelListener listener) {
        this.cancle = cancle;
        this.cancelListener=listener;
        return this;
    }

    public CustomDialog setConfirm(String confirm,IOnConfirmListener listener) {
        this.confirm = confirm;
        this.confirmListener=listener;
        return this;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_custom_dialog);
        //设置宽度
        WindowManager m=getWindow().getWindowManager();
        Display d=m.getDefaultDisplay();
        WindowManager.LayoutParams p=getWindow().getAttributes();
        Point size =new Point();
        d.getSize(size);
        p.width= (int) (size.x*0.8);
        getWindow().setAttributes(p);


        mTvTitle=findViewById(R.id.tv_title);
        mTvMessage=findViewById(R.id.tv_message);
        mTvCancle=findViewById(R.id.tv_cancel);
        mTvConfirm=findViewById(R.id.tv_confirm);
        if(!TextUtils.isEmpty(title)){
            mTvTitle.setText(title);
        }
        if (!TextUtils.isEmpty(message)){
            mTvMessage.setText(message);
        }
        if (!TextUtils.isEmpty(cancle)){
            mTvCancle.setText(cancle);
        }
        if (!TextUtils.isEmpty(confirm)){
            mTvConfirm.setText(confirm);
        }
        mTvConfirm.setOnClickListener(this);
        mTvCancle.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_cancel:
                if (cancelListener!=null){
                    cancelListener.onCancle(this);
                }
                dismiss();
                break;
            case R.id.tv_confirm:
                if (confirmListener!=null){
                    confirmListener.onConfirm(this);
                }
                dismiss();
                break;

        }
    }

    public interface IOnCancelListener{
        void onCancle(CustomDialog dialog);
    }
    public interface IOnConfirmListener{
        void onConfirm(CustomDialog dialog);
    }
}
