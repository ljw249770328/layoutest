package com.example.asus.layoutest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class LIfeCycleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("Lifecycle","---onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","---onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","---onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","---onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","---onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","---onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","---onDestroy");
    }
}
