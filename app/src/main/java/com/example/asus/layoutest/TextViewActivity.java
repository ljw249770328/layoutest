package com.example.asus.layoutest;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mtv4;
    private TextView mtv5;
    private TextView mtv6;
    private TextView mtv7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4=findViewById(R.id.tv_4);
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        mtv4.getPaint().setAntiAlias(true);//去除锯齿

        mtv5=findViewById(R.id.tv_5);
        mtv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);

        mtv6=findViewById(R.id.tv_6);
        mtv6.setText(Html.fromHtml("<u>测试测试测试测试</u>"));


    }
}
