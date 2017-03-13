package com.mufeng.toolproject;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mufeng.toolproject.utils.DirectoryUtils;
import com.mufeng.toolproject.utils.FileStorageHelper;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
    }

    /**
     * 初始化数据
     */
    private void initData() {
        DirectoryUtils.getEnvironmentDirectories();
        DirectoryUtils.getApplicationDirectories(this);

        String path = Environment.getExternalStorageDirectory().toString();

//        FileStorageHelper.copyFilesFromAssets(this, "doc_test.txt", path + "/" + "a_mufeng");
//        FileStorageHelper.copyFilesFromAssets(this, "apk", path + "/" + "a_mufeng");
//        FileStorageHelper.copyFilesFromAssets(this, "apk/app_test.apk", path + "/" + "a_mufeng");

        FileStorageHelper.copyFilesFromRaw(this,R.raw.doc_test,"doc_test",path + "/" + "mufeng");
    }
}
