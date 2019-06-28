package com.example.asus.layoutest.fragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asus.layoutest.R;

public class ContainerActivity extends AppCompatActivity {
    private Fragment AFragment,BFragment;
    private Button mBtnChange;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
//        mBtnChange=findViewById(R.id.btn_change);


        //实例化Fragment
        AFragment= com.example.asus.layoutest.fragment.AFragment.newInstance("我是参数");
        getSupportFragmentManager().beginTransaction().add(R.id.fl_container,AFragment,"a").commitAllowingStateLoss();
//        mBtnChange.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if (BFragment==null){
//                    BFragment=new BFragment();
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,BFragment).commitAllowingStateLoss();
//            }
//        });
    }
}
