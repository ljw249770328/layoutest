package com.example.asus.layoutest.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.asus.layoutest.R;

public class AFragment extends Fragment {
    private TextView mTvTitle;
    private Button mBtnChange,mBtnReset;
    private BFragment BFragment;

    public static AFragment newInstance(String title){
        AFragment fragment=new AFragment();
        Bundle bundle =new Bundle();
        bundle.putString("title",title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_a,container,false);
        Log.d("Afragment","--------OnCreateView---------");
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mTvTitle=view.findViewById(R.id.tv_title);
        mBtnChange=view .findViewById(R.id.btn_change);
        mBtnReset=view.findViewById(R.id.btn_Reset);
        mBtnChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BFragment==null){
                    BFragment=new BFragment();
                }
                Fragment fragment=getFragmentManager().findFragmentByTag("a");
                if (fragment!=null){
                    getActivity().getSupportFragmentManager().beginTransaction().hide(fragment).add(R.id.fl_container,BFragment).addToBackStack(null).commitAllowingStateLoss();
                }else{
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,BFragment).addToBackStack(null).commitAllowingStateLoss();
                }
            }
        });

        mBtnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvTitle.setText("我是新文字");
            }
        });
        if (getArguments()!=null){
            mTvTitle.setText(getArguments().getString("title"));
        }
    }
}
