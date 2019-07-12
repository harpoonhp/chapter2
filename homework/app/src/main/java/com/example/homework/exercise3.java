package com.example.homework;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.SimpleAdapter;
import java.util.*;


public class exercise3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise3);
        ListView listView = findViewById(R.id.listview);
        SimpleAdapter adapter=new SimpleAdapter(this,DataList(),R.layout.activity_style,new String[]{"imageView","tv_1"},new int[]{R.id.imageView,R.id.tv_1});
        listView.setAdapter(adapter);
        //listView.setAdapter(new ListViewAdapter(this));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(exercise3.this, "当前位置" + position, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(exercise3.this, NewActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });
    }
    //显示8个
    private List<? extends Map<String,?>> DataList() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("imageView",R.drawable.one);
        map.put("tv_1","用户1");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.two);
        map.put("tv_1","用户2");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.three);
        map.put("tv_1","用户3");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.four);
        map.put("tv_1","用户4");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.five);
        map.put("tv_1","用户5");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.six);
        map.put("tv_1","用户6");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.seven);
        map.put("tv_1","用户7");
        list.add(map);
        map=new HashMap<String,Object>();
        map.put("imageView",R.drawable.eight);
        map.put("tv_1","用户8");
        list.add(map);
        return list;
    }
    //显示多个
    /*public class ListViewAdapter extends BaseAdapter {

        private Context mContext;

        public ListViewAdapter(Context context) {
            mContext = context;
        }
        @Override public int getCount() {
            return 100;
        }
        @Override public Object getItem(int position) {
            return null;
        }
        @Override public long getItemId(int position) {
            return 0;
        }
        @Override public View getView(int position, View convertView, ViewGroup parent) {
            View view;
            if (convertView == null) {
                LayoutInflater inflater = LayoutInflater.from(mContext);
                view = inflater.inflate(R.layout.activity_style, null);
            } else {
                view =  convertView;
            }
            return view;
        }
    }*/
}
