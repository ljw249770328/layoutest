package com.example.asus.layoutest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.asus.layoutest.fragment.ContainerActivity;
import com.example.asus.layoutest.gridView.GridViewActivity;
import com.example.asus.layoutest.jump.AActivity;
import com.example.asus.layoutest.listView.ListViewActivity;
import com.example.asus.layoutest.recyclerview.RecyclerViewActivity;

public class UIActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mbtnLayout;
    private Button mbtnButton;
    private Button mbtnLoginmenu;
    private Button mbtnRadioButton;
    private Button mbtnCheckBox;
    private Button mbtnImageView;
    private Button mBtnListview;
    private Button mBtnGridView;
    private Button mBtnLIfeCycle,mBtnJump;
    private Button mBtnRv;
    private Button mBtnWv;
    private Button mBtnToast,mBtnDialog,mBtnProgress,mBtnCustomPg,mBtnPopupWindow,mBtnFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        mBtnTextView=findViewById(R.id.btn_textView);
        mbtnLayout=findViewById(R.id.btn_Layout);
        mbtnButton=findViewById(R.id.btn_button);
        mbtnLoginmenu=findViewById(R.id.btn_LoginMenu);
        mbtnRadioButton=findViewById(R.id.btn_radiobutton);
        mbtnCheckBox=findViewById(R.id.btn_checkbox);
        mbtnImageView=findViewById(R.id.btn_imageview);
        mBtnListview=findViewById(R.id.btn_listview);
        mBtnGridView=findViewById(R.id.btn_gridview);
        mBtnRv=findViewById(R.id.btn_recyclerview);
        mBtnWv=findViewById(R.id.btn_webview);
        mBtnToast=findViewById(R.id.btn_toast);
        mBtnDialog=findViewById(R.id.btn_dialog);
        mBtnProgress=findViewById(R.id.btn_progress);
        mBtnCustomPg=findViewById(R.id.btn_customprogress);
        mBtnPopupWindow=findViewById(R.id.btn_popupwindow);
        mBtnLIfeCycle=findViewById(R.id.btn_lifecycle);
        mBtnJump=findViewById(R.id.btn_jump);
        mBtnFragment=findViewById(R.id.btn_fragment);
        setListeners();
//        mbtnLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(UIActivity.this,RelativeLayoutActivity.class);
//                startActivity(intent);
//            }
//        });
//        mBtnTextView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //跳转到TextView
//                Intent intent=new Intent(UIActivity.this,TextViewActivity.class);
//                startActivity(intent);
//            }
//        });
//        mbtnButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//
//            public void onClick(View v) {
//                Intent intent =new Intent(UIActivity.this,ButtonActivity.class);
//                startActivity(intent);
//            }
//        });
//        mbtnLoginmenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(UIActivity.this,EditTextActivity.class);
//                startActivity(intent);
//            }
//        });
    }
    private void setListeners(){
        OnClick onClick=new OnClick();
        mBtnTextView.setOnClickListener(onClick);
        mbtnLayout.setOnClickListener(onClick);
        mbtnButton.setOnClickListener(onClick);
        mbtnLoginmenu.setOnClickListener(onClick);
        mbtnRadioButton.setOnClickListener(onClick);
        mbtnCheckBox.setOnClickListener(onClick);
        mbtnImageView.setOnClickListener(onClick);
        mBtnListview.setOnClickListener(onClick);
        mBtnGridView.setOnClickListener(onClick);
        mBtnRv.setOnClickListener(onClick);
        mBtnWv.setOnClickListener(onClick);
        mBtnToast.setOnClickListener(onClick);
        mBtnDialog.setOnClickListener(onClick);
        mBtnProgress.setOnClickListener(onClick);
        mBtnCustomPg.setOnClickListener(onClick);
        mBtnPopupWindow.setOnClickListener(onClick);
        mBtnLIfeCycle.setOnClickListener(onClick);
        mBtnJump.setOnClickListener(onClick);
        mBtnFragment.setOnClickListener(onClick);
    }
    private class OnClick implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Intent intent=null;
            switch (v.getId()){
                case R.id.btn_textView:
                    intent=new Intent(UIActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_button:
                    intent =new Intent(UIActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_Layout:
                    intent=new Intent(UIActivity.this,RelativeLayoutActivity.class);
                    break;
                case R.id.btn_LoginMenu:
                    intent=new Intent(UIActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radiobutton:
                    intent=new Intent(UIActivity.this,RadioButtonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent=new Intent(UIActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageview:
                    intent =new Intent(UIActivity.this, ImageViewActivity.class);
                    break;
                case R.id.btn_listview:
                    intent=new Intent(UIActivity.this,ListViewActivity.class);
                    break;
                case R.id.btn_gridview:
                    intent=new Intent(UIActivity.this,GridViewActivity.class);
                    break;
                case R.id.btn_lifecycle:
                    intent=new Intent(UIActivity.this,LIfeCycleActivity.class);
                    break;
                case R.id.btn_recyclerview:
                    intent=new Intent(UIActivity.this,RecyclerViewActivity.class);
                    break;
                case R.id.btn_webview:
                    intent=new Intent(UIActivity.this,WebViewActivity.class);
                    break;
                case R.id.btn_toast:
                    intent=new Intent(UIActivity.this,ToastActivity.class);
                    break;
                case R.id.btn_dialog:
                    intent=new Intent(UIActivity.this,DialogActivity.class);
                    break;
                case R.id.btn_progress:
                    intent=new Intent(UIActivity.this,ProgressActivity.class);
                    break;
                case R.id.btn_customprogress:
                    intent=new Intent(UIActivity.this,CustomDialogActivity.class);
                    break;
                case R.id.btn_popupwindow:
                    intent=new Intent(UIActivity.this,PopupWindowActivity.class);
                    break;
                case R.id.btn_jump:
                    intent=new Intent(UIActivity.this,AActivity.class);
                    break;
                case R.id.btn_fragment:
                    intent=new Intent(UIActivity.this, ContainerActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }

}
