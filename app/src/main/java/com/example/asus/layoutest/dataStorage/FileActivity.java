package com.example.asus.layoutest.dataStorage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.asus.layoutest.R;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileActivity extends AppCompatActivity {
    private String mFilename ="text.txt";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file);
        }
        //保存数据
        private void Save(String mContent){
            FileOutputStream  mFileOutputStream=null;
            try {
                mFileOutputStream=openFileOutput(mFilename,MODE_PRIVATE);
                mFileOutputStream.write(mContent.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (mFileOutputStream!=null){
                    try {
                        mFileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        //读取数据
     private String Read(){
         FileInputStream mFileInputStream=null;
         try {
             mFileInputStream=openFileInput(mFilename);
             byte[] buff =new byte[1024];
             StringBuilder sb =new StringBuilder();
             int len =-1;
             while((len =mFileInputStream.read(buff))!=-1){
                 sb.append(new String(buff,0,len));
             }
             return sb.toString();
         } catch (IOException e) {
             e.printStackTrace();
         }
         return  null;
     }
}
