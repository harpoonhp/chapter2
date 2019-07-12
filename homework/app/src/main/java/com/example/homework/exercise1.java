package com.example.homework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 * 屏幕旋转时生命周期为：onPause->onStop->onDestroy->onCreate->onStart->onResume.
 */

public class exercise1 extends AppCompatActivity {

    private static final String TAG = "exercise1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        TextView tv = findViewById(R.id.tv);
        tv.setText("屏幕旋转时生命周期为：onPause->onStop->onDestroy->onCreate->onStart->onResume");
        tv.setTextSize(30);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() called");
    }
}
