package com.example.homework;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */

public class exercise2 extends AppCompatActivity {
    private static final String TAG = "exercise2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_exercise2, null);
        setContentView(inflate);
        int sum = getViewCount(inflate);
        Log.d(TAG, "View count = " + sum);
    }
    public static int getViewCount(View view) {
        int count = 0;
        if(view == null)
            return 0;
        if(view instanceof ViewGroup){
           count += ((ViewGroup) view).getChildCount();
            for(int i = 0; i < ((ViewGroup) view).getChildCount(); i++){
                View child = ((ViewGroup) view).getChildAt(i);
                count += getViewCount(child);
            }
        }
        return count;
    }
}
