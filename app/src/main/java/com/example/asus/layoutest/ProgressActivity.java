package com.example.asus.layoutest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressActivity extends AppCompatActivity {
    private ProgressBar mPb3;
    private Button mBtnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        mPb3=findViewById(R.id.pb3);
        mBtnStart=findViewById(R.id.btn_start);
        mPb3.setProgress(30);
        findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPb3.setProgress(mPb3.getProgress()+10);
                if (mPb3.getProgress()==100){
                    mPb3.setProgress(0);
                    mPb3.setVisibility(View.GONE);
                }
                if (mPb3.getVisibility()==View.GONE){
                    mPb3.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}
