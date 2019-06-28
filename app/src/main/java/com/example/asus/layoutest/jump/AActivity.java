package com.example.asus.layoutest.jump;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.asus.layoutest.R;

public class AActivity extends AppCompatActivity {
    private Button mBtnJump;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mBtnJump=findViewById(R.id.btn_jump);
        mBtnJump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显式跳转1
                Intent intent=new Intent(AActivity.this,BActivity.class);
                startActivity(intent);

//                //显式跳转2
//                Intent intent=new Intent();
//                intent.setClass(AActivity.this,BActivity.class);
//                startActivity(intent);
//                //显式跳转3
//                Intent intent=new Intent();
//                intent.setClassName(AActivity.this,"com.example.asus.layoutest.jump.BActivity");
//                startActivity(intent);\
//                //显式跳转4
//                Intent intent=new Intent();
//                intent.setComponent(new ComponentName(AActivity.this,"com.example.asus.layoutest.jump.BActivity"));
//                startActivity(intent);
//                 //隐式跳转1
//                Intent intent =new Intent();
//                intent.setAction("com.asus.test.BActivity");
//                startActivity(intent);

            }
        });


    }
}
